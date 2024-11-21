package com.project.tutouis

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        // Titulo
        val titleTextView = findViewById<TextView>(R.id.titleTextView)
        val fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        titleTextView.startAnimation(fadeInAnimation)

        // Subtítulo (slide_in)
        val subtitleTextView = findViewById<TextView>(R.id.subtitleTextView)
        val slideInAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_in)
        subtitleTextView.startAnimation(slideInAnimation)


    }
}
