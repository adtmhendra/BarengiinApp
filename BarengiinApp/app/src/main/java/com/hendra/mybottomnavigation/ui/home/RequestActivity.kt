package com.hendra.mybottomnavigation.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hendra.mybottomnavigation.R
import kotlinx.android.synthetic.main.activity_request.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class RequestActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_request)
        supportActionBar?.hide()

        btnBackRequest.setOnClickListener(this)
        btnPesanTumpangan.setOnClickListener(this)
        btnBatalkanPesanan.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.btnBackRequest -> finish()
            R.id.btnPesanTumpangan -> {
                gone()
                GlobalScope.launch {
                    delay(3000)
                    startActivity(Intent(this@RequestActivity, DetailTumpanganActivity::class.java))
                    finish()
                }
            }
            R.id.btnBatalkanPesanan -> finish()
        }
    }

    private fun gone() {
        btnPesanTumpangan.visibility = View.GONE
        btnBatalkanPesanan.visibility = View.VISIBLE
    }
}