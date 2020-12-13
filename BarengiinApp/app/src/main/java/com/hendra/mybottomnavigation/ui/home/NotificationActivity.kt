package com.hendra.mybottomnavigation.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hendra.mybottomnavigation.R

class NotificationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)

        supportActionBar?.title = "Aktivitas"
    }
}