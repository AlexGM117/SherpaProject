package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val viewModel: GetDataViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_View)

        recyclerView.layoutManager = LinearLayoutManager(this)

        viewModel.callAPI()
        viewModel.listResponse.observe(this) { it ->
            val adapter = RVAdapter(it) { name ->
                Toast.makeText(this, name, Toast.LENGTH_SHORT).show()
            }
            recyclerView.adapter = adapter
            recyclerView.setHasFixedSize(true)
        }
    }
}