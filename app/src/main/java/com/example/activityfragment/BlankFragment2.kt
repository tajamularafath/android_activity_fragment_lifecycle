package com.example.activityfragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class BlankFragment2 : Fragment(R.layout.fragment_blank2) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("OnCreateFragment2", "OnCreateFragment2: Create the fragment 2 Instance")
    }

    override fun onAttach(context: Context) {
        Log.e("OnAttach", "OnAttachFragment2: Create the view of fragment 2 Instance")
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("OnCreateViewFragment2", "OnCreateViewFragment2: Create the view of fragment 2 Instance")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("OnViewCreatedFragment2", "Create the OnViewCreatedFragment2")
    }

    override fun onStart() {
        super.onStart()
        Log.e("OnStartFragment2", "OnStart: Fragment 2 Start")
    }

    override fun onResume() {
        super.onResume()
        Log.e("OnResumeFragment2", "onResume is Running of Fragment2")
    }

    override fun onPause() {
        super.onPause()
        Log.e("onPauseFragment2", "onPause is Running of Fragment2")
    }

    override fun onStop() {
        super.onStop()
        Log.e("onStopFragment2", "onStop is Running of Fragment2")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.e("onSaveInstanceStateFragment2", "onSaveInstanceState is Running of Fragment2")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("onDestroyViewFragment2", "onDestroyView is Running of Fragment2")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroyFragment2", "onDestroy is Running of Fragment2")
    }

}