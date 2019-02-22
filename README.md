# android-mobile-analytics

[![Build Status](https://cloud.drone.io/api/badges/v7lin/android-mobile-analytics/status.svg)](https://cloud.drone.io/v7lin/android-mobile-analytics)
[ ![Download](https://api.bintray.com/packages/v7lin/maven/mobile-analytics-baidu-android/images/download.svg) ](https://bintray.com/v7lin/maven/mobile-analytics-baidu-android/_latestVersion)
[ ![Download](https://api.bintray.com/packages/v7lin/maven/mobile-analytics-talkingdata-android/images/download.svg) ](https://bintray.com/v7lin/maven/mobile-analytics-talkingdata-android/_latestVersion)

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
