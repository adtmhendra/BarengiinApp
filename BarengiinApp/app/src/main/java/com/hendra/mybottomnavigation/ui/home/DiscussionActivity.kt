package com.hendra.mybottomnavigation.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hendra.mybottomnavigation.R

class DiscussionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_discussion)
        supportActionBar?.title = "Diskusi"
    }
}