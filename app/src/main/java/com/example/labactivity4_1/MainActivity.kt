package com.example.labactivity4_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the views from the XML layout
        val etNumber = findViewById<EditText>(R.id.etNumber)
        val btnGo = findViewById<Button>(R.id.btnGo)

        // Set the click listener for the button
        btnGo.setOnClickListener {
            val numberStr = etNumber.text.toString()

            // Check if input is not empty before proceeding
            if (numberStr.isNotEmpty()) {
                val intent = Intent(this, SecondActivity::class.java)
                // Pass the number to the next activity
                intent.putExtra("COUNT", numberStr.toInt())
                startActivity(intent)
            }
        }
    }
}