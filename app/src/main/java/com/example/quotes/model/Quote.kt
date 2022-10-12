package com.example.quotes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Quote(@StringRes val QuoteResourceId : Int,
                 @StringRes val authorResourceId : Int,
                 @DrawableRes val imageResourceId : Int)