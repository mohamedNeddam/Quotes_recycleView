package com.example.quotes.data

import com.example.quotes.R
import com.example.quotes.model.Quote

class DataSource {
    fun loadQuotes() : List<Quote>{
        return listOf(
            Quote(R.string.quote1),
            Quote(R.string.quote2),
            Quote(R.string.quote3),
            Quote(R.string.quote4),
            Quote(R.string.quote5),
            Quote(R.string.quote6),
            Quote(R.string.quote7),
            Quote(R.string.quote8),
            Quote(R.string.quote9),
            Quote(R.string.quote10),
        )
    }
}