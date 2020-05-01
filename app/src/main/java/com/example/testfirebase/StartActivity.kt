package com.example.testfirebase

import android.os.Bundle
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.start_activity.*

class StartActivity: AppCompatActivity() {

    private lateinit var topAnim : Animation
    private lateinit var bottomAnim : Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        // One way to hide the ActionBar(ColorPrimary and ColorPrimaryDark in styles.xml)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_activity)

        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)

        //we assign each animation to his view
        imageView_start_application_logo.startAnimation(topAnim)
        textView_help_your_Neighbour.startAnimation(bottomAnim)
        textView_we_are_in_solidarity.startAnimation(bottomAnim)

    }
}