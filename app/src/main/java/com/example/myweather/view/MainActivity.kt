package com.example.myweather.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidonkotlin.view.main.MainFragment
import com.example.myweather.R
import com.example.myweather.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {

    //private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
        }
    }
}