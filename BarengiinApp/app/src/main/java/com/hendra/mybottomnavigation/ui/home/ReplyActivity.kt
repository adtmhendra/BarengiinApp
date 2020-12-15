package com.hendra.mybottomnavigation.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.hendra.mybottomnavigation.R
import kotlinx.android.synthetic.main.activity_reply.*

class ReplyActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reply)
        supportActionBar?.title = "Balas Pertanyaan"

        imgPerson.setOnClickListener(this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.reply_menu, menu)
        return true
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.imgPerson -> {
                val intent = Intent(this, AddFriendActivity::class.java)
                startActivity(intent)
            }
        }
    }
}