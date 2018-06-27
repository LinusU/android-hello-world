# Hello, World!

A simple Android application. The goal is to test out a nice development environment setup.

- ✅ Use **any editor** to develop, not just Android Studio
- ✅ From freshly cloned repo to running app in a **single command**
- ✅ **No generated files** checked into git (e.g. `.xcodeproj`)

## Prerequisites

This setup depends on the Android SDK, Android Platform Tools, Java, Kotlin and Gradle being installed. They can be installed using [Homebrew](https://brew.sh/) with the following commands:

```sh
brew cask install homebrew/cask-versions/java8
brew cask install android-platform-tools
brew cask install android-sdk
brew install kotlin
brew install gradle

# Add ANDROID_HOME / ANDROID_SDK_ROOT to your profile
vim ~/.profile
source ~/.profile

# Accept Android licenses
/usr/local/share/android-sdk/tools/bin/sdkmanager --licenses
```

## Emulator

In order to run the app in the emulator some additional steps are required:

### Emulator Prerequisites

```sh
# Install emulator
/usr/local/share/android-sdk/tools/bin/sdkmanager emulator

# Install system image
/usr/local/share/android-sdk/tools/bin/sdkmanager 'system-images;android-19;google_apis;x86'

# Create emulator
/usr/local/share/android-sdk/tools/bin/avdmanager create avd -n MyEmulator -k 'system-images;android-19;google_apis;x86'
```

### Starting emulator

```sh
/usr/local/share/android-sdk/emulator/emulator @MyEmulator
```

## Building / Running

To fetch dependencies, build dependencies, build the app and then finally install the app on the first plugged in device (or emulator), run the `installDebug` task.

```sh
gradle installDebug
```

If you want to build without installing and installing the app, use the `assembleDebug` task.

```sh
gradle assembleDebug
```
