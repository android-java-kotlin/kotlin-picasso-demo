package com.m7amdelbana.picassodemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    lateinit var imgView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgView = findViewById(R.id.imageView)

        loadImageUrl("http://i.imgur.com/DvpvklR.pjdfgdfkhng")
    }

    private fun loadImageUrl(url: String) {
        Picasso.get()
            .load(url)
            .placeholder(R.drawable.img_placeholder)
            .error(R.drawable.img_error)
            .into(imgView)

    }
}
