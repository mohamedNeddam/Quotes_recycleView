package com.example.quotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.quotes.data.DataSource

class MainActivity : AppCompatActivity() {
    private lateinit var textview : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        textview = findViewById(R.id.textview)
//        textview.text = DataSource().loadQuotes().size.toString()
    }
}