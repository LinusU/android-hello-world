package org.linusu.hello

import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView

class MainActivity : Activity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val label = TextView(this)
    label.setText("Hello, World!")
    label.setGravity(Gravity.CENTER)
    label.setTextSize(24.toFloat())

    setContentView(label)
  }
}
