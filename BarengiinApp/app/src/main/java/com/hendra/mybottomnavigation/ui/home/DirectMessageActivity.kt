package com.hendra.mybottomnavigation.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.hendra.mybottomnavigation.R

class DirectMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_direct_message)
        supportActionBar?.title = "Riwayat Pesan"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.dm_menu, menu)
        return true
    }
}