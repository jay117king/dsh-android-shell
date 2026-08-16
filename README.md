# dsh-android-shell

**Your own Android shell for DeepSeek Harness (DSH)**  
WebView UI + embedded runtime — inspired by [kelai141/dsh-mobile-apk](https://github.com/kelai141/dsh-mobile-apk) and [qiannianhuanxiang/DSHA](https://github.com/qiannianhuanxiang/DSHA).

> This is a starter repository. Use it as a base to build your own full on-device DSH launcher.

---

## 🚀 Easiest way to start (GitHub Codespaces)

1. Open this repo: **https://github.com/jay117king/dsh-android-shell**
2. Click the green **Code** button
3. Choose the **Codespaces** tab
4. Click **Create codespace on main**

Wait 1–2 minutes → you get a full VS Code + Java + Android SDK in your browser.

Full guide: [docs/CODESPACES.md](docs/CODESPACES.md)

---

## Even easier recommendation

The absolute simplest path is:

1. Go to [kelai141/dsh-mobile-apk](https://github.com/kelai141/dsh-mobile-apk)
2. Click **Fork**
3. Open **your fork** in Codespaces
4. Change the app name, package name and icon

Then you already have a working app.

---

## Goal

Create an Android APK that:

- Runs **DeepSeek Harness** fully on the device (no PC required)
- Uses a **WebView** for the UI
- Embeds a runtime (Termux-style snapshot **or** proot + Ubuntu)
- Has keep-alive + watchdog
- Supports SAF directory picking

---

## Two Recommended Approaches

| Approach | Base Project | Style |
|----------|--------------|-------|
| **Fast extract-and-run** | [kelai141/dsh-mobile-apk](https://github.com/kelai141/dsh-mobile-apk) | Pre-built ~70MB snapshot, extracts in ~10s |
| **Full Linux environment** | [qiannianhuanxiang/DSHA](https://github.com/qiannianhuanxiang/DSHA) | proot + Ubuntu rootfs, more complete |

---

## Project Structure

```
app/
  src/main/
    java/com/example/dshshell/
      MainActivity.kt       # WebView host
      AndroidBridge.kt      # JS ↔ Native bridge
      EngineService.kt      # Foreground service + watchdog
    AndroidManifest.xml
```

---

## Useful Links

- [kelai141/dsh-mobile-apk](https://github.com/kelai141/dsh-mobile-apk) — Termux snapshot style
- [qiannianhuanxiang/DSHA](https://github.com/qiannianhuanxiang/DSHA) — proot + Ubuntu style
- [libtermux-android](https://github.com/libtermux/libtermux-android) — library to embed Termux
- Official DeepSeek Harness: [deepseek-ai/deepseek-harness](https://github.com/deepseek-ai/deepseek-harness)

---

## License

MIT (or choose your own).
