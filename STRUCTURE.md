# Project Structure

```
dsh-android-shell/
│
├── README.md                 # Main documentation
├── STRUCTURE.md               # This file
├── docs/
│   └── GETTING_STARTED.md     # How to start
│
└── app/
    └── src/main/
        ├── AndroidManifest.xml
        ├── java/com/example/dshshell/
        │   ├── MainActivity.kt      # WebView host
        │   ├── AndroidBridge.kt     # JS ↔ Native bridge
        │   └── EngineService.kt     # Foreground service + watchdog
        │
        ├── assets/                 # Put snapshot.tar.xz here later
        └── res/                     # Icons, strings, themes
```

## Current status

This is a **skeleton only**.

To make a working app you still need to:

1. Bring real code from `kelai141/dsh-mobile-apk` or `DSHA`
2. Add Gradle build files (`build.gradle.kts`, `settings.gradle.kts`, etc.)
3. Implement runtime extraction / proot
4. Wire the bridge methods
5. Add proper icons and theming

See `docs/GETTING_STARTED.md` for the recommended path.
