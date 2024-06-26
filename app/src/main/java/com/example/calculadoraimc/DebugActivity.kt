package com.example.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class DebugActivity : AppCompatActivity() {

    private val TAG = "LMSApp"
    private val className: String
        get() {
            val s = javaClass.name // br.com.fernandosousa.lmsapp.DebugActivity
            return s.substring(s.lastIndexOf(".")) // .DebugActivity
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "$className.onCreate() chamado")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "$className.onStart() chamado")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "$className.onResume() chamado")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "$className.onRestart() chamado")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "$className.onPause() chamado")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "$className.onStop() chamado")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "$className.onDestroy() chamado")
    }
}