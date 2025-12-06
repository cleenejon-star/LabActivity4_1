package com.example.labactivity4_1

import android.content.Context

open class TextProvider(private val context: Context) {
    open fun getItemText(position: Int): String {
        return "Item $position"
    }

    open fun getResultText(clickedText: String): String {
        return "You clicked $clickedText"
    }
}