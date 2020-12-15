package com.hendra.mybottomnavigation

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.hendra.mybottomnavigation.ui.home.DirectMessageActivity
import com.hendra.mybottomnavigation.ui.home.NotificationActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
                R.id.navigation_beranda, R.id.navigation_riwayat, R.id.navigation_favorit, R.id.navigation_profil))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.actionbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem):Boolean {
        return when (item.itemId) {
            R.id.activity -> {
                val intentToNotification = Intent(this@MainActivity, NotificationActivity::class.java)
                startActivity(intentToNotification)
                return true
            }
            R.id.chat -> {
                val intent = Intent(this, DirectMessageActivity::class.java)
                startActivity(intent)
                return true
            }
            else -> true
        }
    }
}