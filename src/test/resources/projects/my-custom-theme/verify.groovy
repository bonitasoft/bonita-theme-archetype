import java.io.*
import java.util.zip.ZipFile
import java.util.Properties

def archive = context.projectDir.toPath()
        .resolve("target")
        .resolve("my-custom-theme-0.0.1-SNAPSHOT.zip")
        .toFile()

assert archive.exists() : "$archive should have been built"

def zf = new ZipFile(archive)
def pomFileEntry = zf.entries().find { it.name == 'META-INF/maven/org.company.theme/my-custom-theme/pom.xml' }

assert pomFileEntry != null : 'pom.xml file not found in META-INF'

def pomPropertiesEntry = zf.entries().find { it.name == 'META-INF/maven/org.company.theme/my-custom-theme/pom.properties' }
assert pomPropertiesEntry != null : 'pom.properties file not found in META-INF'

def properties = new Properties()
properties.load(zf.getInputStream(pomPropertiesEntry))
assert properties.groupId == 'org.company.theme' : 'Invalid groupId property'
assert properties.artifactId == 'my-custom-theme' : 'Invalid artifactId property'
assert properties.version == '0.0.1-SNAPSHOT' : 'Invalid version property'
