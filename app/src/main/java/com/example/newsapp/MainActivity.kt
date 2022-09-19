package com.example.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var posts = ArrayList<news>()
    var curNews = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        for (i in 0..5) {
            if (i % 2 == 0) {
                posts.add(news("Title $i", "Body $i", R.mipmap.btc_foreground))
            } else {
                posts.add(news("Title $i", "Body $i", R.mipmap.ic_launcher_foreground))
            }

        }
        val t = findViewById<TextView>(R.id.postTitle)
        t.text = posts[0].title

        val b = findViewById<TextView>(R.id.postBody)
        b.text = posts[0].body

        val i = findViewById<ImageView>(R.id.postImage)
        i.setImageResource(posts[curNews].image)
    }

    fun nextPost (view: View) {
        curNews++
        if (curNews >= posts.size) {
            curNews = 0
        }
        val t = findViewById<TextView>(R.id.postTitle)
        t.text = posts[curNews].title

        val b = findViewById<TextView>(R.id.postBody)
        b.text = posts[curNews].body

        val i = findViewById<ImageView>(R.id.postImage)
        i.setImageResource(posts[curNews].image)
    }

    fun prevPost (view: View) {
        curNews--
        if (curNews < 0) {
            curNews = posts.size - 1
        }
        val t = findViewById<TextView>(R.id.postTitle)
        t.text = posts[curNews].title

        val b = findViewById<TextView>(R.id.postBody)
        b.text = posts[curNews].body

        val i = findViewById<ImageView>(R.id.postImage)
        i.setImageResource(posts[curNews].image)
    }
}