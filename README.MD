
# Compose Multiplatform Application

## Android and Desktop App

![App Screenshot](https://github.com/chandradeepkumar16/KMPJetNotes/assets/62211734/d1e28311-59c2-4de9-b86f-7f7978cf5051)

## Web App


![App Screenshot](https://github.com/chandradeepkumar16/KMPJetNotes/assets/62211734/2b366383-05e9-4203-9bd1-c08d1bb01fdd)

# Instructions

## Before running!
 - check your system with [KDoctor](https://github.com/Kotlin/kdoctor)
 - install JDK 8 on your machine
 - add `local.properties` file to the project root and set a path to Android SDK there

### Android
To run the application on android device/emulator:  
 - open project in Android Studio and run imported android run configuration

To build the application bundle:
 - run `./gradlew :composeApp:assembleDebug`
 - find `.apk` file in `composeApp/build/outputs/apk/debug/composeApp-debug.apk`

### Desktop
Run the desktop application: `./gradlew :composeApp:run`

### iOS
To run the application on iPhone device/simulator:
 - Open `iosApp/iosApp.xcproject` in Xcode and run standard configuration
 - Or use [Kotlin Multiplatform Mobile plugin](https://plugins.jetbrains.com/plugin/14936-kotlin-multiplatform-mobile) for Android Studio

### Browser
Run the browser application: `./gradlew :composeApp:jsBrowserDevelopmentRun`

