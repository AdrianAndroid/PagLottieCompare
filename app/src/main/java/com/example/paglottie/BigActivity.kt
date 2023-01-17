package com.example.paglottie

import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
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

        }

        findViewById<View>(R.id.btn3).setOnClickListener {
            dynamicAdd();
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