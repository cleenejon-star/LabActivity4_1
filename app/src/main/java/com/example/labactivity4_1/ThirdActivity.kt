package com.example.labactivity4_1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val clickedText = intent.getStringExtra("CLICKED_TEXT") ?: ""
        val tvResult = findViewById<TextView>(R.id.tvResult)

        val app = application as LabApplication
        tvResult.text = app.textProvider.getResultText(clickedText)
    }
}