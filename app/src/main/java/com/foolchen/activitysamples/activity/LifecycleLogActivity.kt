package com.foolchen.activitysamples.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.foolchen.activitysamples.utils.logMethod

/**
 * 该Activity用于被集成，并且会打印出当前Activity的所有生命周期
 * @author chenchong
 * 2018/5/21
 * 上午10:43
 */
abstract class LifecycleLogActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    logMethod("Lifecycle", localClassName, "onCreate",
        "savedInstanceState")
  }

  override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
    super.onCreate(savedInstanceState, persistentState)
    logMethod("Lifecycle", localClassName, "onCreate",
        "savedInstanceState", "persistentState")
  }

  override fun onPostCreate(savedInstanceState: Bundle?) {
    super.onPostCreate(savedInstanceState)
    logMethod("Lifecycle", localClassName, "onPostCreate",
        "savedInstanceState")
  }

  override fun onPostCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
    super.onPostCreate(savedInstanceState, persistentState)
    logMethod("Lifecycle", localClassName, "onPostCreate",
        "savedInstanceState", "persistentState")
  }

  override fun onStart() {
    super.onStart()
    logMethod("Lifecycle", localClassName, "onStart")
  }

  override fun onResume() {
    super.onResume()
    logMethod("Lifecycle", localClassName, "onResume")
  }

  override fun onPostResume() {
    super.onPostResume()
    logMethod("Lifecycle", localClassName, "onPostResume")
  }

  override fun onPause() {
    super.onPause()
    logMethod("Lifecycle", localClassName, "onPause")
  }

  override fun onStop() {
    super.onStop()
    logMethod("Lifecycle", localClassName, "onStop")
  }

  override fun onDestroy() {
    super.onDestroy()
    logMethod("Lifecycle", localClassName, "onDestroy")
  }
}