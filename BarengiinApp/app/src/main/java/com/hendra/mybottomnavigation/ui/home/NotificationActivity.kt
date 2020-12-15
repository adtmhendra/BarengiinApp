package com.hendra.mybottomnavigation.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hendra.mybottomnavigation.R
import kotlinx.android.synthetic.main.activity_notification.*

class NotificationActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)

        supportActionBar?.title = "Aktivitas"

        btnTerima.setOnClickListener(this)
        btnTeman.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.btnTerima -> btnTerimaGone()
            R.id.btnTeman -> btnTemanGone()
        }
    }

    private fun btnTerimaGone() {
        btnTerima.visibility = View.INVISIBLE
        btnTeman.visibility = View.VISIBLE
    }

    private fun btnTemanGone() {
        btnTerima.visibility = View.VISIBLE
        btnTeman.visibility = View.INVISIBLE
    }
}