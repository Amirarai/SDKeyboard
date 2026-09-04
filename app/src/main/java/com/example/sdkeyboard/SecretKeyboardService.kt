package com.example.sdkeyboard

import android.inputmethodservice.InputMethodService
import android.view.View
import android.widget.Button
import android.widget.LinearLayout

class SecretKeyboardService : InputMethodService() {

    override fun onCreateInputView(): View {

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL

        val keys = arrayOf(
            arrayOf("Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P"),
            arrayOf("A", "S", "D", "F", "G", "H", "J", "K", "L"),
            arrayOf("Z", "X", "C", "V", "B", "N", "M")
        )

        for (row in keys) {
            val rowLayout = LinearLayout(this)
            rowLayout.orientation = LinearLayout.HORIZONTAL

            for (letter in row) {
                val button = Button(this)
                button.text = letter

                button.setOnClickListener {
                    currentInputConnection.commitText(letter.lowercase(), 1)
                }

                rowLayout.addView(button)
            }

            layout.addView(rowLayout)
        }

        return layout
    }
}
