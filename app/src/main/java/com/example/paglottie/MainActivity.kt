package com.example.paglottie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.btnMain).setOnClickListener {
            startActivity(Intent(this@MainActivity, MainActivity::class.java))
        }
        findViewById<View>(R.id.btnBig).setOnClickListener {
            startActivity(Intent(this@MainActivity, BigActivity::class.java))
        }
        findViewById<View>(R.id.btnVir).setOnClickListener {
            startActivity(Intent(this@MainActivity, VirActivity::class.java))
        }
        findViewById<View>(R.id.btnSav).setOnClickListener {
            startActivity(Intent(this@MainActivity, SavActivity::class.java))
        }
    }
}