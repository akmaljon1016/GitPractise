package com.example.gitpractise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("THIS IS CONTAINED IN MY SECOND COMMIT")
        println("LOCAL CHANGE")
        println("Change 3")
        for (i in 0..8) {
            print(i.toString())
        }
        println("Hello from yout friend")
    }
}