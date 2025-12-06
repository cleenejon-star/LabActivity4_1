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

        val etNumber = findViewById<EditText>(R.id.etNumber)
        val btnGo = findViewById<Button>(R.id.btnGo)

        btnGo.setOnClickListener {
            val numberStr = etNumber.text.toString()

            if (numberStr.isNotEmpty()) {
                val intent = Intent(this, SecondActivity::class.java)
                // Pass the number to the next activity
                intent.putExtra("COUNT", numberStr.toInt())
                startActivity(intent)
            }
        }
    }
}