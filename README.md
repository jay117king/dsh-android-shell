# dsh-android-shell

**Your own Android shell for DeepSeek Harness (DSH)**  
WebView UI + embedded runtime — inspired by [kelai141/dsh-mobile-apk](https://github.com/kelai141/dsh-mobile-apk) and [qiannianhuanxiang/DSHA](https://github.com/qiannianhuanxiang/DSHA).

> This is a starter repository. Use it as a base to build your own full on-device DSH launcher.

---

## Goal

Create an Android APK that:

- Runs **DeepSeek Harness** fully on the device (no PC required)
- Uses a **WebView** for the UI
- Embeds a runtime (Termux-style snapshot **or** proot + Ubuntu)
- Has keep-alive + watchdog
- Supports SAF directory picking
- Can be updated without reinstalling the whole APK

---

## Two Recommended Approaches

| Approach | Base Project | Style |
|----------|--------------|-------|
| **Fast extract-and-run** | [kelai141/dsh-mobile-apk](https://github.com/kelai141/dsh-mobile-apk) | Pre-built ~70MB snapshot, extracts in ~10s |
| **Full Linux environment** | [qiannianhuanxiang/DSHA](https://github.com/qiannianhuanxiang/DSHA) | proot + Ubuntu rootfs, more complete |

### Recommended starting point

1. Fork one of the above repositories
2. Change package name, app name, icon, and branding
3. Push the changes into **this** repository
4. Build and release your own APKs here

---

## Quick Start (Fork Route)

```bash
# 1. Fork the base project on GitHub, then clone your fork
git clone https://github.com/YOUR_USERNAME/dsh-mobile-apk.git
cd dsh-mobile-apk

# 2. Change remote to point to this repo
git remote set-url origin https://github.com/jay117king/dsh-android-shell.git

# 3. Make your changes (package name, icons, features...)

# 4. Build
./gradlew assembleDebug
# or
./gradlew assembleRelease
```

---

## Project Structure (Typical)

```
app/
  src/main/
    java/.../MainActivity.kt      # WebView + Bridge
    java/.../EngineService.kt     # Foreground service + watchdog
    java/.../AndroidBridge.kt     # JS ↔ Native bridge
    assets/
      snapshot.tar.xz             # Embedded runtime (or download on first run)
    res/                          # Icons, strings, themes
```

---

## Core Components You Need

1. **WebView** loading `http://127.0.0.1:3080`
2. **JavascriptInterface** (`androidBridge`) for:
   - `pickDirectory()`
   - `checkEngine()`
   - `keepScreenOn()`
   - notifications, etc.
3. **Foreground Service** so Android doesn't kill the engine
4. **Watchdog** that restarts the process if it dies
5. **Runtime extraction** (first launch) or proot setup
6. **SAF** for real file access

---

## Building Requirements

- Android Studio (latest)
- JDK 17+
- Android SDK (compileSdk 34 or 36)
- Gradle 8.x

---

## Publishing Releases

1. Build a signed release APK
2. Go to **Releases** → **Create a new release**
3. Tag it (e.g. `v0.1.0`)
4. Upload the `.apk` file(s)
5. Write release notes

---

## Useful Links

- [kelai141/dsh-mobile-apk](https://github.com/kelai141/dsh-mobile-apk) — Termux snapshot style
- [qiannianhuanxiang/DSHA](https://github.com/qiannianhuanxiang/DSHA) — proot + Ubuntu style
- [libtermux-android](https://github.com/libtermux/libtermux-android) — library to embed Termux
- Official DeepSeek Harness: [deepseek-ai/deepseek-harness](https://github.com/deepseek-ai/deepseek-harness)

---

## License

MIT (or choose your own).  
Remember to respect the licenses of any code you base this on.

---

**Next steps for you:**

1. Decide which base project you prefer
2. Fork it
3. Customize it
4. Push the code into this repository
5. Create your first Release with an APK

Good luck building your own DSH Android shell! 🚀
