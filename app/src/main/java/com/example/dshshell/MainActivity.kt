package com.example.dshshell

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

/**
 * Main entry point.
 * Loads the local DeepSeek Harness Web UI in a full-screen WebView.
 *
 * TODO:
 * 1. Change package name to your own
 * 2. Start EngineService onCreate
 * 3. Add AndroidBridge (JavascriptInterface)
 * 4. Handle first-run extraction of the runtime snapshot
 */
class MainActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        webView = WebView(this).apply {
            settings.javaScriptEnabled = true
            settings.domStorageEnabled = true
            webViewClient = WebViewClient()

            // TODO: Add JavascriptInterface
            // addJavascriptInterface(AndroidBridge(this@MainActivity), "androidBridge")

            // Load local DSH web UI (default port)
            loadUrl("http://127.0.0.1:3080")
        }

        setContentView(webView)

        // TODO: Start the engine service
        // startForegroundService(Intent(this, EngineService::class.java))
    }

    override fun onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}
