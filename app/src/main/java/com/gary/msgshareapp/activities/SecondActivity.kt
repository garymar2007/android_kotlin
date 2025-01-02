package com.gary.msgshareapp.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import com.gary.msgshareapp.databinding.ActivitySecondBinding
import com.gary.msgshareapp.showToast

class SecondActivity: ComponentActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Share data in implicit intent
        val message = intent.getStringExtra("user_message")
        showToast( "Hi, $message")

        binding.txtUserMessage.text = message
    }

}