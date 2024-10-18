package com.codepath.articlesearch

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

private const val TAG = "DetailActivity"

class DetailActivity : AppCompatActivity() {
    private lateinit var mediaImage: ImageView
    private lateinit var titleText: TextView
    private lateinit var bylineText: TextView
    private lateinit var abstractText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        mediaImage = findViewById(R.id.Image)
        titleText = findViewById(R.id.Title)
        bylineText = findViewById(R.id.medialine)
        abstractText = findViewById(R.id.mediaAbstract)

        val article = intent.getSerializableExtra(ARTICLE_EXTRA) as Article

        titleText.text = article.headline?.main
        bylineText.text = article.byline?.original
        abstractText.text = article.abstract

        Glide.with(this)
            .load(article.mediaImageUrl)
            .into(mediaImage)
    }
}