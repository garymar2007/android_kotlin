package com.gary.msgshareapp.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gary.msgshareapp.adapters.HobbiesAdapter
import com.gary.msgshareapp.R
import com.gary.msgshareapp.models.Supplier

class HobbiesActivity: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_hobbies)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        val adapter = HobbiesAdapter(this, Supplier.hobbies)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = layoutManager
        //recyclerView.setHasFixedSize(true)

    }
}