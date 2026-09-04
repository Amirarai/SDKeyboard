package com.example.sdkeyboard

import android.inputmethodservice.InputMethodService
import android.view.View
import android.widget.TextView

class SecretKeyboardService : InputMethodService() {

    override fun onCreateInputView(): View {
        val textView = TextView(this)
        textView.text = "SD Keyboard is active"
        textView.textSize = 20f
        textView.setPadding(30, 30, 30, 30)

        return textView
    }
}
