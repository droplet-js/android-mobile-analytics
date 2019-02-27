# android-mobile-analytics

[![Build Status](https://cloud.drone.io/api/badges/v7lin/android-mobile-analytics/status.svg)](https://cloud.drone.io/v7lin/android-mobile-analytics)
[![GitHub tag](https://img.shields.io/github/tag/v7lin/android-mobile-analytics.svg)](https://github.com/v7lin/android-mobile-analytics/releases)
[![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=14)

### snapshot

````
ext {
    latestVersion = '1.0.0-SNAPSHOT'
}

allprojects {
    repositories {
        ...
        maven {
            url 'https://oss.jfrog.org/artifactory/oss-snapshot-local'
        }
        ...
    }
}
````

### release

````
ext {
    latestVersion = '1.0.0'
}

allprojects {
    repositories {
        ...
        jcenter()
        ...
    }
}
````

### usage

android
````
...
dependencies {
    ...
    implementation "io.github.v7lin:mobile-analytics-baidu-android:${latestVersion}"
//    implementation "io.github.v7lin:mobile-analytics-talkingdata-android:${latestVersion}"
    ...
}
...
````
