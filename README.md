# Android Utilities SDK
A lightweight and easy-to-use library that allows developers to retrieve essential information about the user's device, including brand, model, manufacturer, and more.
Minimum Android SDK = 21

## Getting started

### Add Jitpack IO to your project

Go to `settings.gradle.kts` (for project with Kotlin DSL) or `build.gradle`  in project level (for project with Groovy) and add jitpack as maven URL.
#### Gradle with Kotlin Project
```kotlin
dependencyResolutionManagement {
    repositories {
        maven { setUrl("https://jitpack.io") }
    }
}
```
#### or, Gradle with Groovy Project
```kotlin
buildscript {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```
### Import our library
```kotlin
implementation 'com.github.giovankabisano:AndroidUtilities:1.0.4'
```

## Features
### Basic Device Information
#### Model
``` kotlin
import com.giovankov.deviceInformation.model
val x = model() 
print(x) //m2012k11ag
```
#### Manufacturer
``` kotlin
import com.giovankov.deviceInformation.manufacturer
val x = manufacturer()
print(x) //Xiaomi
```
#### Brand
``` kotlin
import com.giovankov.deviceInformation.brand
val x = brand()
print(x) //POCO
```

### Internet Connection Checking
Coming soon in version 1.1.0
