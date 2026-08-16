package com.example.dshshell

import android.content.Context
import android.webkit.JavascriptInterface
import org.json.JSONObject

/**
 * Bridge between WebView JavaScript and native Android code.
 *
 * In the web page you can call:
 *   window.androidBridge.pickDirectory(callbackId)
 *   window.androidBridge.checkEngine()
 *   window.androidBridge.keepScreenOn(true)
 *
 * TODO: Implement real SAF picker, engine health check, etc.
 */
class AndroidBridge(private val context: Context) {

    @JavascriptInterface
    fun version(): String = "1.0"

    @JavascriptInterface
    fun checkEngine(): String {
        // TODO: Probe http://127.0.0.1:3080 and return real status
        val result = JSONObject()
        result.put("running", false)
        result.put("latencyMs", -1)
        return result.toString()
    }

    @JavascriptInterface
    fun keepScreenOn(enable: Boolean) {
        // TODO: Implement wake lock
    }

    @JavascriptInterface
    fun showNotification(title: String, text: String) {
        // TODO: Show system notification
    }

    @JavascriptInterface
    fun pickDirectory(callbackId: String) {
        // TODO: Launch SAF directory picker
        // When done, call back into JS:
        // webView.evaluateJavascript("window.__dshBridge.onDirectoryPicked('$callbackId', '/path')", null)
    }
}
