package com.hendra.mybottomnavigation.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hendra.mybottomnavigation.R
import kotlinx.android.synthetic.main.activity_tumpangan.*

class TumpanganActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tumpangan)
        supportActionBar?.hide()

        btnBackTumpangan.setOnClickListener(this)
        btnPesanTumpangan.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.btnBackTumpangan -> finish()
            R.id.btnPesanTumpangan -> {
                val intent = Intent(this@TumpanganActivity, DestinationResultActivity::class.java)
                startActivity(intent)
            }
        }
    }
}