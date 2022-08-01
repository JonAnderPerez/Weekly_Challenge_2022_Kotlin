package com.jonanpg.weeklychallenge2022kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Challenge05Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_challenge05)

        Challenge05().aspectRatio("https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png")
    }
}