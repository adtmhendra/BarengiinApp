package com.hendra.mybottomnavigation.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hendra.mybottomnavigation.R
import kotlinx.android.synthetic.main.activity_detail_tumpangan.*

class DetailTumpanganActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_tumpangan)
        supportActionBar?.hide()

        btnBatalkanPesanan.setOnClickListener(this)
        btnEmergency.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.btnBatalkanPesanan -> finish()
            R.id.btnEmergency -> {
                val intent = Intent(this, EmergencyActivity::class.java)
                startActivity(intent)
            }
        }
    }
}