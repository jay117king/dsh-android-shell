# Getting Started

## Option A — Fastest way (Recommended)

1. Go to one of these repos and click **Fork**:
   - [kelai141/dsh-mobile-apk](https://github.com/kelai141/dsh-mobile-apk) (Termux snapshot style)
   - [qiannianhuanxiang/DSHA](https://github.com/qiannianhuanxiang/DSHA) (proot + Ubuntu style)

2. Clone **your fork**:
   ```bash
   git clone https://github.com/YOUR_USERNAME/dsh-mobile-apk.git
   cd dsh-mobile-apk
   ```

3. Point it to this repository:
   ```bash
   git remote set-url origin https://github.com/jay117king/dsh-android-shell.git
   git push -u origin main
   ```

4. Open the project in **Android Studio** and start customizing.

---

## Option B — Start from this skeleton

This repository currently contains a skeleton.  
You still need to bring in the real engine code from one of the projects above.

### What you need to add

- `app/src/main/java/.../MainActivity.kt`
- `app/src/main/java/.../EngineService.kt`
- `app/src/main/java/.../AndroidBridge.kt`
- Runtime snapshot or proot setup
- Gradle build files (`build.gradle.kts`, `settings.gradle.kts`, etc.)

---

## Useful commands

```bash
# Build debug APK
./gradlew assembleDebug

# Build release APK (needs signing config)
./gradlew assembleRelease
```
