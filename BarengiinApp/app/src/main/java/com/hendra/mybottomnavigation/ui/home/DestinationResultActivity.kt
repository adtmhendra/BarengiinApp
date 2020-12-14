package com.hendra.mybottomnavigation.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hendra.mybottomnavigation.R
import kotlinx.android.synthetic.main.activity_destination_result.*

class DestinationResultActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_destination_result)

        supportActionBar?.title = "Hasil Pencarian"
        imgDriverProfile.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = Intent(this@DestinationResultActivity, RequestActivity::class.java)
        startActivity(intent)
    }
}