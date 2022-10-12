package com.example.quotes.data

import com.example.quotes.R
import com.example.quotes.model.Quote

class DataSource {
    fun loadQuotes() : List<Quote>{
        return listOf(
            Quote(R.string.quote1,R.string.author1),
            Quote(R.string.quote2,R.string.author2),
            Quote(R.string.quote3,R.string.author3),
            Quote(R.string.quote4,R.string.author4),
            Quote(R.string.quote5,R.string.author5),
            Quote(R.string.quote6,R.string.author6),
            Quote(R.string.quote7,R.string.author7),
            Quote(R.string.quote8,R.string.author8),
            Quote(R.string.quote9,R.string.author9),
            Quote(R.string.quote10,R.string.author10),
        )
    }
}