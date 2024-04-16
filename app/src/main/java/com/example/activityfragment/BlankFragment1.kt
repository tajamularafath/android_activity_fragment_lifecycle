package com.example.activityfragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class BlankFragment1 : Fragment(R.layout.fragment_blank1) {

    override fun onAttach(context: Context) {
        Log.e("onAttach", "It's run when attaching to the activity")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("OnCreateFragment1", "OnCreateFragment1: Create the fragment 1 Instance")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("OnCreateViewFragment1", "OnCreateViewFragment1: Create the view of fragment 1 Instance")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("OnViewCreatedFragment1", "Create the OnViewCreatedFragment1")
    }

    override fun onStart() {
        super.onStart()
        Log.e("OnStartFragment1", "OnStartFragment1: Fragment 1 Start")
    }

    override fun onResume() {
        super.onResume()
        Log.e("OnResumeFragment1", "onResume is Running of Fragment1")
    }

    override fun onPause() {
        super.onPause()
        Log.e("onPauseFragment2", "onPause is Running of Fragment1")
    }

    override fun onStop() {
        super.onStop()
        Log.e("onStopFragment1", "onStop is Running of Fragment1")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.e("onSaveInstanceStateFragment1", "onSaveInstanceState is Running of Fragment1")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("onDestroyViewFragment1", "onDestroyView is Running of Fragment1")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroyFragment1", "onDestroy is Running of Fragment1")
    }

}