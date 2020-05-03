package com.example.phsychobar_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_registration_geo.*

class registration_eng : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
        actionBar?.hide()
        setContentView(R.layout.activity_registration_eng)


        friend_check.setOnClickListener {
            registration_choosing.isVisible = false
            friend_registration.isVisible = true
        }
        friend_check_1.setOnClickListener {
            registration_choosing.isVisible = false
            friend_registration.isVisible = true
        }
        psycholog_check.setOnClickListener {
            registration_choosing.isVisible = false
            psycholog_registration.isVisible = true
        }
        psycholog_check_1.setOnClickListener {
            registration_choosing.isVisible = false
            psycholog_registration.isVisible = true
        }
    }
}
