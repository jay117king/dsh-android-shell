# Important Note

## Gradle Wrapper is missing

This skeleton does **not** include the Gradle Wrapper files (`gradlew`, `gradlew.bat`, `gradle/wrapper/`).

### How to open / build this project

**Easiest way:**

1. Open **Android Studio**
2. Choose **Open** and select this project folder
3. Android Studio will automatically offer to create / download the Gradle Wrapper
4. Accept it and wait for the sync to finish

**Alternative (command line):**

If you already have Gradle installed:

```bash
gradle wrapper --gradle-version 8.11.1
```

Then you can use:

```bash
./gradlew assembleDebug
```

---

## Current state of this repository

This is a **working skeleton** that Android Studio can open, but it still needs:

- Real engine code (from kelai141 or DSHA)
- Runtime snapshot / proot setup
- Proper icons (`res/mipmap/`)
- Full implementation of the bridge and service

See `docs/GETTING_STARTED.md` for the recommended next steps.
