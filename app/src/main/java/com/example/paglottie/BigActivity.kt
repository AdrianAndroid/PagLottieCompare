package com.example.paglottie

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.Lottie
import com.airbnb.lottie.LottieAnimationView

class BigActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_big)

        findViewById<View>(R.id.btn1).setOnClickListener {
        }

        findViewById<View>(R.id.btn2).setOnClickListener {
//            val lottieContainer = findViewById<FrameLayout>(R.id.lottieContainer)
//            val lotView = LottieAnimationView(this@BigActivity)
            val lottie = findViewById<LottieAnimationView>(R.id.lottie);
            lottie.repeatCount = 10000
            lottie.playAnimation()
        }

        findViewById<View>(R.id.btn3).setOnClickListener {
            dynamicAdd();
            val lottie = findViewById<LottieAnimationView>(R.id.lottie);
            lottie.repeatCount = 10000
            lottie.playAnimation()
        }
    }


    fun dynamicAdd() {
    }
}