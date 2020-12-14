package com.hendra.mybottomnavigation.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.hendra.mybottomnavigation.R
import com.hendra.mybottomnavigation.model.Destination
import com.hendra.mybottomnavigation.ui.home.DestinationDetailActivity
import kotlinx.android.synthetic.main.destination_rows.view.*

class ListDestinationAdapter(private val listDestination: ArrayList<Destination>) : RecyclerView.Adapter<ListDestinationAdapter.DestinationViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): DestinationViewHolder {
        val view = DestinationViewHolder(LayoutInflater.from(viewGroup.context).inflate(R.layout.destination_rows, viewGroup, false))
        return view
    }

    override fun getItemCount(): Int = listDestination.size

    override fun onBindViewHolder(holder: DestinationViewHolder, position: Int) {
        val destination = listDestination[position]

        holder.bindItem(destination)
        holder.itemView.setOnClickListener{ view ->
            Toast.makeText(view.context, destination.title, Toast.LENGTH_SHORT).show()

            val moveIntentWithObject = Intent(view.context, DestinationDetailActivity::class.java)
            moveIntentWithObject.putExtra(DestinationDetailActivity.EXTRA_DATA, destination)
            view.context.startActivity(moveIntentWithObject)
        }
    }

    inner class DestinationViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindItem(destination: Destination) {
            with(itemView) {
                tvTitleDestination.text = destination.title
                tvDescDestination.text = destination.description
                Glide.with(this).load(destination.image).into(imgDestination)
            }
        }
    }
}