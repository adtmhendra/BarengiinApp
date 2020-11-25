package com.hendra.mybottomnavigation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.hendra.mybottomnavigation.R
import com.hendra.mybottomnavigation.model.News
import kotlinx.android.synthetic.main.news_rows.view.*

class ListNewsAdapter(private val news: ArrayList<News>) : RecyclerView.Adapter<ListNewsAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder = ListViewHolder(LayoutInflater.from(viewGroup.context).inflate(R.layout.news_rows, viewGroup, false))

    override fun getItemCount(): Int = news.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val listNews = news[position]

        holder.bindItem(listNews)
        holder.itemView.setOnClickListener { view ->
            Toast.makeText(view.context, listNews.title, Toast.LENGTH_SHORT).show()
        }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItem(news: News) {
            with(itemView) {
                tvNews.text = news.title
                Glide.with(itemView).load(news.image).into(imgNews)
            }
        }
    }
}