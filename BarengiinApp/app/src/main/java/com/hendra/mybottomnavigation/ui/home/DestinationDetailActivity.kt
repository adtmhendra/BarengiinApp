package com.hendra.mybottomnavigation.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bumptech.glide.Glide
import com.hendra.mybottomnavigation.R
import com.hendra.mybottomnavigation.model.Destination
import kotlinx.android.synthetic.main.activity_destination_detail.*

class DestinationDetailActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        const val EXTRA_DATA = "extra_data"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_destination_detail)
        this.supportActionBar?.hide()

        actionBar?.title = "Detail Destinasi"

        val destination = intent.getParcelableExtra(DestinationDetailActivity.EXTRA_DATA) as? Destination

        tvDetTitle.text = destination?.title.toString()
        tvDetDescription.text = destination?.description.toString()
        Glide.with(this).load(destination?.image).into(imgDetDestination)

        btnBack.setOnClickListener(this)
        tvLihatLebih.setOnClickListener(this)
        btnCariTumpanganDetail.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.btnBack -> finish()
            R.id.tvLihatLebih -> {
                val intent = Intent(this@DestinationDetailActivity, DiscussionActivity::class.java)
                startActivity(intent)
            }
            R.id.btnCariTumpanganDetail -> {
                val intent = Intent(this, DestinationResultActivity::class.java)
                startActivity(intent)
            }
        }
    }
}