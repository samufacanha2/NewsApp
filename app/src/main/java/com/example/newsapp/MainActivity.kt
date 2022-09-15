package com.example.newsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var posts = ArrayList<news>()
    var curNews = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val news = news("title1", "body1", R.drawable.ic_launcher_foreground)
        posts.add(news)
        var t = findViewById<TextView>(R.id.p1_Title)
        t.text = posts[0].title
    }
}