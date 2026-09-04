package com.example.sdkeyboard

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.setPadding(40, 80, 40, 40)

        val title = TextView(this)
        title.text = "SD Keyboard"
        title.textSize = 28f

        val info = TextView(this)
        info.text = "\nEnable SD Keyboard from Android Settings, then select it as your keyboard."
        info.textSize = 18f

        val button = Button(this)
        button.text = "Enable Keyboard"

        button.setOnClickListener {
            val intent = Intent(Settings.ACTION_INPUT_METHOD_SETTINGS)
            startActivity(intent)
        }

        layout.addView(title)
        layout.addView(info)
        layout.addView(button)

        setContentView(layout)
    }
}
