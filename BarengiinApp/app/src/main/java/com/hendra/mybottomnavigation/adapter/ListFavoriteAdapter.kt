package com.hendra.mybottomnavigation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.hendra.mybottomnavigation.R
import com.hendra.mybottomnavigation.model.Favorite
import kotlinx.android.synthetic.main.favorite_rows.view.*

class ListFavoriteAdapter(private val listFavorite: ArrayList<Favorite>) : RecyclerView.Adapter<ListFavoriteAdapter.FavoriteViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): FavoriteViewHolder {
        val view = FavoriteViewHolder(LayoutInflater.from(viewGroup.context).inflate(R.layout.favorite_rows, viewGroup, false))
        return view
    }

    override fun getItemCount(): Int = listFavorite.size

    override fun onBindViewHolder(holder: FavoriteViewHolder, position: Int) {
        val favorite = listFavorite[position]

        holder.bindItem(favorite)
        holder.itemView.setOnClickListener { view ->
            Toast.makeText(view.context, favorite.title, Toast.LENGTH_SHORT).show()
        }
    }

    inner class FavoriteViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        fun bindItem(favorite: Favorite) {
            with(itemView) {
                tvFavorite.text = favorite.title
                Glide.with(itemView).load(favorite.image).into(imgFavorite)
            }
        }
    }
}