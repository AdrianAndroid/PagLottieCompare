package com.example.paglottie

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.Lottie
import com.airbnb.lottie.LottieAnimationView
import org.libpag.PAGFile
import org.libpag.PAGView

class BigActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_big)

        findViewById<View>(R.id.btn1).setOnClickListener {
            val pagView = findViewById<PAGView>(R.id.pagView)
            val pagContainer = findViewById<FrameLayout>(R.id.pagContainer);
            val pagFile = PAGFile.Load(assets, "big/pag/dawenjian.pag")
//            val pagView = PAGView(this@BigActivity)
//            pagContainer.addView(pagView)
            pagView.composition = pagFile
            pagView.setRepeatCount(0)
            pagView.play()
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
        // ViewGroup
        val pagContainer = findViewById<FrameLayout>(R.id.pagContainer);
        // 加载File
        val pagFile = PAGFile.Load(assets, "big/pag/dawenjian.pag")
        // 创建PAGView
        val pagView = PAGView(this@BigActivity)
        // 加入ViewGroup
        pagContainer.addView(pagView)
        // 设置文件来源
        pagView.composition = pagFile
        pagView.setRepeatCount(0)
        // 播放
        pagView.play()
    }
}