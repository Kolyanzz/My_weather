package com.example.myweather.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidonkotlin.view.main.MainFragment
import com.example.myweather.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
        }
    }
}