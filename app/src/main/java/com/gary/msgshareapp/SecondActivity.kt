package com.gary.msgshareapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import com.gary.msgshareapp.databinding.ActivitySecondBinding

class SecondActivity: ComponentActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Share data in implicit intent
        val message = intent.getStringExtra("user_message")
        Toast.makeText(this, "Hi, $message", Toast.LENGTH_SHORT).show()

        binding.txtUserMessage.text = message
    }

}