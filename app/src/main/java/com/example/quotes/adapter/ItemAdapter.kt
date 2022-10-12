package com.example.quotes.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.quotes.R
import com.example.quotes.model.Quote

class ItemAdapter(private val context: Context, private val quoteList: List<Quote>)
    : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textViewQuote : TextView = view.findViewById(R.id.item_title_quote)
        val textViewAuthor: TextView = view.findViewById(R.id.item_title_author)
        val imageView : ImageView = view.findViewById(R.id.item_image)
    }

    //  Create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val layoutAdapter = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item,parent,false)

        return ItemViewHolder(layoutAdapter)
    }

    // update the contents of a view
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = quoteList[position]
        holder.textViewQuote.text = context.resources.getString(item.QuoteResourceId)
        holder.textViewAuthor.text = context.resources.getString(item.authorResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    override fun getItemCount() = quoteList.size
}