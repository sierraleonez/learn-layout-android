package com.example.myviewandviewgroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.title = "Google Pixel"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}