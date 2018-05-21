package com.foolchen.activitysamples.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout

/**
 * 用于演示Activity的生命周期
 * @author chenchong
 * 2018/5/21
 * 上午11:01
 */
class B : LifecycleLogActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val btn = Button(this)
    btn.text = "打开C"
    btn.layoutParams = FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,
        FrameLayout.LayoutParams.WRAP_CONTENT)
    setContentView(btn)
    btn.setOnClickListener { startActivity(Intent(this, C::class.java)) }
  }
}