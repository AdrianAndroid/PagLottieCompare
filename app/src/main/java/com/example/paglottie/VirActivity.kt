package com.example.paglottie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class VirActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vir)

        findViewById<View>(R.id.btn1).setOnClickListener {
        }

        findViewById<View>(R.id.btn2).setOnClickListener {

        }

        findViewById<View>(R.id.btn3).setOnClickListener {
            dynamicAdd();
        }
    }


    fun dynamicAdd() {

    }
}