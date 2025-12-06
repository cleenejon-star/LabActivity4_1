package com.example.labactivity4_1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val count = intent.getIntExtra("COUNT", 0)
        val app = application as LabApplication
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Load items using the helper class
        app.listLoader.loadItems(count) { items ->
            recyclerView.adapter = ListAdapter(items) { clickedItem ->
                val intent = Intent(this, ThirdActivity::class.java)
                intent.putExtra("CLICKED_TEXT", clickedItem.text)
                startActivity(intent)
            }
        }
    }
}