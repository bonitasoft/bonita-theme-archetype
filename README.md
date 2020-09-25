[![Actions Status](https://github.com/bonitasoft/bonita-theme-archetype/workflows/Build/badge.svg)](https://github.com/bonitasoft/bonita-theme-archetype/actions?query=workflow%3ABuild)
[![Sonarcloud Status](https://sonarcloud.io/api/project_badges/measure?project=bonitasoft_bonita-theme-archetype&metric=alert_status)](https://sonarcloud.io/dashboard?id=bonitasoft_bonita-theme-archetype)
[![GitHub release](https://img.shields.io/github/v/release/bonitasoft/bonita-theme-archetype?color=blue&label=Release&include_prereleases)](https://github.com/bonitasoft/bonita-theme-archetype/releases)
[![Maven Central](https://img.shields.io/maven-central/v/org.bonitasoft.archetypes/bonita-theme-archetype.svg?label=Maven%20Central&color=orange)](https://search.maven.org/search?q=g:%22org.bonitasoft.archetypes%22%20AND%20a:%22bonita-theme-archetype%22)
[![License: GPL v2](https://img.shields.io/badge/License-GPL%20v2-yellow.svg)](https://www.gnu.org/licenses/old-licenses/gpl-2.0.en.html)

# bonita-theme-archetype

[short description and link to the documentation]

## Disclaimer
* Use a JRE/JDK 1.8

## How to build the archetype

```
git clone https://github.com/bonitasoft/bonita-theme-archetype.git
cd bonita-theme-archetype
./mvnw clean install
```

## How to use the archetype

```
mvn archetype:generate \
    -DarchetypeGroupId=org.bonitasoft.archetypes \
    -DarchetypeArtifactId=bonita-theme-archetype \
    -DgroupId=org.company.api \
    -DartifactId=my-rest-api \
    -Dversion=0.0.1-SNAPSHOT \
    -Dname=myTheme \
    -DdisplayName="My Theme" 
```

### Optionnal archetype parameters


| Parameter         | Required   | Default value                     | Description                                                                            										   |
| ------------------|------------|-----------------------------------|-------------------------|
| -Ddescription     | __false__  |     Describe your project here    | Description of the theme|
 
