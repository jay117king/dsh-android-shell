package com.example.dshshell

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.content.Intent
import android.os.Build
import android.os.IBinder
import androidx.core.app.NotificationCompat

/**
 * Foreground service that keeps the DSH engine alive.
 *
 * Responsibilities:
 * - Start / stop the embedded Node.js + dsh process
 * - Show a persistent notification
 * - Watchdog: restart the engine if it crashes
 *
 * TODO:
 * 1. Extract runtime snapshot on first run
 * 2. Launch the real dsh process
 * 3. Implement watchdog timer
 */
class EngineService : Service() {

    companion object {
        const val CHANNEL_ID = "dsh_engine"
        const val NOTIFICATION_ID = 1001
    }

    override fun onCreate() {
        super.onCreate()
        createNotificationChannel()
        startForeground(NOTIFICATION_ID, buildNotification("Starting engine..."))

        // TODO: Extract snapshot if needed
        // TODO: Start the real engine process
        // TODO: Start watchdog
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return START_STICKY
    }

    override fun onBind(intent: Intent?): IBinder? = null

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                CHANNEL_ID,
                "DSH Engine",
                NotificationManager.IMPORTANCE_LOW
            )
            val manager = getSystemService(NotificationManager::class.java)
            manager.createNotificationChannel(channel)
        }
    }

    private fun buildNotification(text: String): Notification {
        return NotificationCompat.Builder(this, CHANNEL_ID)
            .setContentTitle("DSH Engine running")
            .setContentText(text)
            .setSmallIcon(android.R.drawable.ic_menu_manage) // replace with your icon
            .setOngoing(true)
            .build()
    }

    override fun onDestroy() {
        // TODO: Kill the engine process cleanly
        super.onDestroy()
    }
}
