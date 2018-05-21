package com.foolchen.activitysamples.utils

import android.util.Log

fun logMethod(tag: String, clazzName: String, methodName: String, vararg params: String) {
  Log.v(tag,
      "$clazzName#$methodName${if (params.isEmpty()) "" else params.joinToString(
          ", ", "(", ")")}")
}