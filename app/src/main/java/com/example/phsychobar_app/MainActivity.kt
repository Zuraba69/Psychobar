package com.example.phsychobar_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
        actionBar?.hide()
        setContentView(R.layout.activity_main)
        dontHaveAnAccountBtn_geo.setOnClickListener {
            startActivity(Intent(this,registration_geo::class.java))
        }
        dontHaveAnAccountBtn_eng.setOnClickListener {
            startActivity(Intent(this,registration_eng::class.java))
        }
        eng_flag.setOnClickListener {
            login_eng.isVisible = true
            login_geo.isVisible = false
            eng_flag.isVisible = false
            geo_flag.isVisible = true
        }
        geo_flag.setOnClickListener {
            login_eng.isVisible = false
            login_geo.isVisible = true
            eng_flag.isVisible = true
            geo_flag.isVisible = false
        }
    }
}
