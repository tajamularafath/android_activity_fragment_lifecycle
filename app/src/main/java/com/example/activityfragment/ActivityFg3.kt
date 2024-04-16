package com.example.activityfragment

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import com.example.activityfragment.databinding.ActivityFg3Binding

class ActivityFg3 : AppCompatActivity() {

    private lateinit var binding: ActivityFg3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFg3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val firstFragment = BlankFragment1()
        val secondFragment = BlankFragment2()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_fragment, firstFragment)
            commit()
        }

        binding.btnFragment1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fl_fragment, firstFragment)
                commit()
            }
        }

        binding.btnFragment2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fl_fragment, secondFragment)
                commit()
            }
        }

    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        Log.e("OncreateView", "Creating View")
        return super.onCreateView(name, context, attrs)
    }




}