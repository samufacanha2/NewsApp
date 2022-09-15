package com.example.newsapp

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
        for (i in 0..5) {
            posts.add(news("Title $i", "Body $i", R.drawable.ic_launcher_foreground))
        }
        val t = findViewById<TextView>(R.id.postTitle)
        val b = findViewById<TextView>(R.id.postBody)
        t.text = posts[0].title
        b.text = posts[0].body
    }

    fun nextPost (view: View) {
        curNews++
        if (curNews >= posts.size) {
            curNews = 0
        }
        var t = findViewById<TextView>(R.id.postTitle)
        t.text = posts[curNews].title

        t = findViewById<TextView>(R.id.postBody)
        t.text = posts[curNews].body
    }

    fun prevPost (view: View) {
        curNews--
        if (curNews < 0) {
            curNews = posts.size - 1
        }
        var t = findViewById<TextView>(R.id.postTitle)
        t.text = posts[curNews].title

        t = findViewById<TextView>(R.id.postBody)
        t.text = posts[curNews].body
    }
}