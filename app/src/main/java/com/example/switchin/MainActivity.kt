package com.example.switchin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class MainActivity : AppCompatActivity() {
    //Variable decl and innit
    //zero Errors

    private lateinit var img1: ImageView
    private lateinit var btnRotate1: Button

    private lateinit var img2: ImageView
    private lateinit var btnRotate2: Button

    private lateinit var img3: ImageView
    private lateinit var btnRotate3: Button

    private lateinit var img4: ImageView
    private lateinit var btnRotate4: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        img1 = findViewById(R.id.imageView1)
        btnRotate1 = findViewById(R.id.button)
        btnRotate1.setOnClickListener { img1.rotation = 90f }

        img2 = findViewById(R.id.imageView3)
        btnRotate2 = findViewById(R.id.button2)
        btnRotate2.setOnClickListener { img2.rotation = 90f }

        img3 = findViewById(R.id.imageView4)
        btnRotate3 = findViewById(R.id.button3)
        btnRotate3.setOnClickListener { img3.rotation = 90f }

        img4 = findViewById(R.id.imageView6)
        btnRotate4 = findViewById(R.id.button4)
        btnRotate4.setOnClickListener { img4.rotation = 90f }

    }
}