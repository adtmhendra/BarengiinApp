package com.hendra.mybottomnavigation.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.hendra.mybottomnavigation.R
import kotlinx.android.synthetic.main.activity_add_friend.*

class AddFriendActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_friend)
        supportActionBar?.hide()

        btnBackAddFriend.setOnClickListener(this)
        btnAddFriend.setOnClickListener(this)
        btnFriend.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.btnBackAddFriend -> finish()
            R.id.btnAddFriend -> btnAddFriendGone()
            R.id.btnFriend -> btnFriendGone()
        }
    }

    private fun btnAddFriendGone() {
        btnAddFriend.visibility = View.INVISIBLE
        btnFriend.visibility = View.VISIBLE
    }

    private fun btnFriendGone() {
        btnAddFriend.visibility = View.VISIBLE
        btnFriend.visibility = View.INVISIBLE
    }
}