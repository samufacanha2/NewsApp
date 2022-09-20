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

                posts.add(news("US Treasury asks regulators to take more action against crypto scams", "The Treasury Department is keenly aware that crypto scams and hacks remain serious problems, and it's pressuring the rest of the US government to respond. As The Washington Postnotes, the Treasury has issued a report calling on other federal regulators to fur…", R.mipmap.btc_foreground))
                posts.add(news("This Cold-Storage Crypto Wallet Is a Smart Investment", "If you don't use a safe, offline storage device, you don't really own your cryptocurrency. The Ledger Nano X keeps it secure from prying eyes.", R.mipmap.ic_launcher_foreground))
                posts.add(news("Congress presses big crypto exchanges for details on how they’re fighting scams", "Congress wrote letters to Coinbase, Binance, FTX, and others to ask how they’re protecting consumers against crypto-related scams.", R.mipmap.btc_foreground))
                posts.add(news("Ethereum completes the 'merge' that will make its crypto transactions greener", "Ethereum has completed its much-anticipated Merge to a far more energy efficient method of minting new coins, the cryptocurrency's co-founder Vitalik Buterin tweeted. Ether coins will no longer be minted by proof-of-work that uses powerful computers to so…", R.mipmap.ic_launcher_foreground))
                posts.add(news("The Ethereum merge, explained", "Laura Shin, host of the crypto podcast Unchained joins Nightcap's Jon Sarlin to break down how the second most valuable crypto changed its core infrastructure while also slashing its energy usage.  For more, watch the full Nightcap episode here.", R.mipmap.btc_foreground))

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