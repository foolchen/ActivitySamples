package com.foolchen.activitysamples.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout

/**
 * 用于演示Activity的生命周期，Translucent属性为true
 * @author chenchong
 * 2018/5/21
 * 上午11:01
 */
class C : LifecycleLogActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val btn = Button(this)
    btn.text = "打开A"
    btn.layoutParams = FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,
        FrameLayout.LayoutParams.WRAP_CONTENT)
    setContentView(btn)
    btn.setOnClickListener { startActivity(Intent(this, A::class.java)) }

  }

  override fun onResume() {
    super.onResume()
    startActivity(Intent(this, A::class.java))
  }
}