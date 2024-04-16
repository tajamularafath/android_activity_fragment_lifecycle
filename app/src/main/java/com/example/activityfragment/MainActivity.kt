package com.example.activityfragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.activityfragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextButton.setOnClickListener {
            val intent = Intent(this@MainActivity, Activity2::class.java)
            startActivity(intent)
        }

    Log.e("OnCreate is Calling", "When ever the Activity1 is created onCreate will be call")
    }

    override fun onStart() {
        super.onStart()
        Log.e("OnStart", "Starting the Activity1")
    }

    override fun onResume() {
        super.onResume()
        Log.e("onResume", "Resuming the Activity1")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("OnRestart", "Restarting the Activity1")
    }

    override fun onPause() {
        super.onPause()
        Log.e("onPause" , "Pausing the Activity1")
    }

    override fun onStop() {
        super.onStop()
        Log.e("onStop", "Stopping the Activity1")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy", "Destroyed the Activity1")
    }
}