package com.gary.msgshareapp.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import com.gary.msgshareapp.Constants
import com.gary.msgshareapp.R
import com.gary.msgshareapp.databinding.ActivityMainBinding
import com.gary.msgshareapp.showToast

class MainActivity : ComponentActivity() {
    companion object {
        val TAG: String = MainActivity::class.java.simpleName
    }
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnShowToast.setOnClickListener {
            Log.i(TAG, resources.getString(R.string.btn_was_clicked))
            showToast(resources.getString(R.string.btn_was_clicked))
        }

        binding.btnSendMsgToNextActivity.setOnClickListener {
            val message: String = binding.editUserMessage.text.toString()
            showToast(message)

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(Constants.USER_MSG_KEY, message)
            startActivity(intent)
        }

        binding.btnShareToOtherApp.setOnClickListener {
            val message: String = binding.editUserMessage.text.toString()
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, resources.getString(R.string.select_your_apps)))
        }

        binding.btnRecyclerView.setOnClickListener {
            val intent = Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }
    }
}