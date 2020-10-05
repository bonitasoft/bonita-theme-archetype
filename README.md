[![Actions Status](https://github.com/bonitasoft/bonita-theme-archetype/workflows/Build/badge.svg)](https://github.com/bonitasoft/bonita-theme-archetype/actions?query=workflow%3ABuild)
[![GitHub release](https://img.shields.io/github/v/release/bonitasoft/bonita-theme-archetype?color=blue&label=Release&include_prereleases)](https://github.com/bonitasoft/bonita-theme-archetype/releases)
[![Maven Central](https://img.shields.io/maven-central/v/org.bonitasoft.archetypes/bonita-theme-archetype.svg?label=Maven%20Central&color=orange)](https://search.maven.org/search?q=g:%22org.bonitasoft.archetypes%22%20AND%20a:%22bonita-theme-archetype%22)
[![License: GPL v2](https://img.shields.io/badge/License-GPL%20v2-yellow.svg)](https://www.gnu.org/licenses/old-licenses/gpl-2.0.en.html)

# bonita-theme-archetype

This project contains a maven archetype, which allow to easily setup a Bonita theme project.  
A theme project is node project wrapped in a maven project that uses:
* [maven-frontend-plugin](https://github.com/eirslett/frontend-maven-plugin) to setup node and npm binaries
* [node-sass](https://www.npmjs.com/package/node-sass) and [bootstrap-sass](https://www.npmjs.com/package/bootstrap-sass) to create your Bootstrap 3 theme using [sass](https://sass-lang.com/)

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
    -DartifactId=my-theme \
    -Dversion=0.0.1-SNAPSHOT \
    -Dname=myTheme \
    -DdisplayName="My Theme" 
```

### Optional archetype parameters


| Parameter         | Required   | Default value                     | Description             |
| ------------------|------------|-----------------------------------|-------------------------|
| -Ddescription     | __false__  |     Describe your project here    | Description of the theme|
| -Dwrapper         | __false__  | true                              | If set to true, project will setup a [maven wrapper](https://github.com/takari/maven-wrapper)|