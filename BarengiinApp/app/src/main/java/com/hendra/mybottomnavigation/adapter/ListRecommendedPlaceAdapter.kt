package com.hendra.mybottomnavigation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.hendra.mybottomnavigation.R
import com.hendra.mybottomnavigation.model.RecommendedPlace
import kotlinx.android.synthetic.main.recommendedplace_rows.view.*

class ListRecommendedPlaceAdapter(private val places: ArrayList<RecommendedPlace>) : RecyclerView.Adapter<ListRecommendedPlaceAdapter.RecommendedPlaceViewHolder>(){
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RecommendedPlaceViewHolder {
        val view = RecommendedPlaceViewHolder(LayoutInflater.from(viewGroup.context).inflate(R.layout.recommendedplace_rows, viewGroup, false))
        return view
    }

    override fun getItemCount(): Int = places.size

    override fun onBindViewHolder(holder: RecommendedPlaceViewHolder, position: Int) {
        val place = places[position]
        holder.bindItem(place)

        holder.itemView.setOnClickListener { view ->
            Toast.makeText(view.context, place.title, Toast.LENGTH_SHORT).show()
        }
    }

    class RecommendedPlaceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItem(recPlace: RecommendedPlace) {
            with(itemView) {
                tvDestinasiWisataPilihan.text = recPlace.title
                Glide.with(itemView).load(recPlace.image).into(imgDestinasiWisataPilihan)
            }
        }
    }
}