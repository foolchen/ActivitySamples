package com.foolchen.activitysamples

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import com.foolchen.activitysamples.activity.A
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    "生命周期".addButton(View.OnClickListener { startActivity(Intent(this, A::class.java)) })

  }

  private fun String.addButton(click: View.OnClickListener) {
    val btn = Button(this@MainActivity)
    val lp = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
        LinearLayout.LayoutParams.WRAP_CONTENT)
    btn.text = this
    btn.setOnClickListener(click)
    content.addView(btn, lp)
  }
}