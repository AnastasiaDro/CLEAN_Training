package com.nestdev.realsolidtraining

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.AttributeSet
import android.view.View
import androidx.core.os.HandlerCompat.postDelayed
import com.nestdev.presentation.MainActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        val view: View? = super.onCreateView(name, context, attrs)
        val handler = Handler()
        postDelayed(handler, Task(this), null, 2000L)
        return view
    }

//An emulation of the long loading of some data
    inner class Task(splashActivity: AppCompatActivity) : Runnable {
        private val activity = splashActivity
        override fun run() {
            val intent = Intent(activity, MainActivity::class.java)
            activity.startActivity(intent)
        }
    }
}
