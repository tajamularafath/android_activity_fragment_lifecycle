package com.example.activityfragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.activityfragment.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {

    private lateinit var binding: Activity2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.e("OnCreate is Calling", "When ever the Activity2 is created onCreate will be call")

        binding.nextButton2.setOnClickListener {
            val intent = Intent(this@Activity2, ActivityFg3::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.e("OnStart", "Starting the Activity2")
    }

    override fun onResume() {
        super.onResume()
        Log.e("onResume", "Resuming the Activity2")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("OnRestart", "Restarting the Activity2")
    }

    override fun onPause() {
        super.onPause()
        Log.e("onPause" , "Pausing the Activity2")
    }

    override fun onStop() {
        super.onStop()
        Log.e("onStop", "Stopping the Activity2")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy", "Destroyed the Activity2")
    }

}