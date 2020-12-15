package com.hendra.mybottomnavigation.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.hendra.mybottomnavigation.R
import kotlinx.android.synthetic.main.activity_discussion.*

class DiscussionActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_discussion)
        supportActionBar?.title = "Diskusi"

        tvBalasan.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.tvBalasan -> {
                val intent = Intent(this@DiscussionActivity, ReplyActivity::class.java)
                startActivity(intent)
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.discussion_menu, menu)
        return true
    }
}