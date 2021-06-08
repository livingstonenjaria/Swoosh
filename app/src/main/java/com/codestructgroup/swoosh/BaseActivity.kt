package com.codestructgroup.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class BaseActivity : AppCompatActivity() {
    val TAG = "Lifecycle"
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate: ${javaClass.simpleName}")
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        Log.d(TAG, "onStart: ${javaClass.simpleName}")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG, "onResume: ${javaClass.simpleName}")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "onPause: ${javaClass.simpleName}")
        super.onPause()
    }

    override fun onRestart() {
        Log.d(TAG, "onRestart: ${javaClass.simpleName}")
        super.onRestart()
    }

    override fun onStop() {
        Log.d(TAG, "onStop: ${javaClass.simpleName}")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy: ${javaClass.simpleName}")
        super.onDestroy()
    }
}