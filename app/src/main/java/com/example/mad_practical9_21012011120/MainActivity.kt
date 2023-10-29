package com.example.mad_practical9_21012011120

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var alarmanimation : AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageAlarm : ImageView =findViewById(R.id.imageAlarm)
        imageAlarm.setBackgroundResource(R.drawable.alarm_animation_list)

        alarmanimation=imageAlarm.background as AnimationDrawable
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        if (hasFocus){
            alarmanimation.start()
        }
        else{
            alarmanimation.stop()
        }
        super.onWindowFocusChanged(hasFocus)
    }
}