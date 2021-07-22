 package com.turtlecode.super_hero_book_youtube

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_information.*

class Information_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)
        val intent = intent
        val hero_name = intent.getStringExtra("superhero_information")
        textView.text = hero_name
        val hero_image = intent.getIntExtra("superhero_image",0)
        val bitmap = BitmapFactory.decodeResource(applicationContext.resources,hero_image)
        imageView.setImageBitmap(bitmap)

    }
}