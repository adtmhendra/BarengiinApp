package com.hendra.mybottomnavigation.ui.home

import android.content.res.TypedArray
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.hendra.mybottomnavigation.R
import com.hendra.mybottomnavigation.adapter.ListDestinationAdapter
import com.hendra.mybottomnavigation.model.Destination
import kotlinx.android.synthetic.main.fragment_destination.*

class DestinationFragment : Fragment() {

    private val destination = ArrayList<Destination>()
    private lateinit var dataDestinationTitle: Array<String>
    private lateinit var dataDestinationDescription: Array<String>
    private lateinit var dataDestinationImage: TypedArray

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_destination, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity).supportActionBar?.title = "Destinasi Wisata"

        showRecyclerListDestination()
    }

    private fun getAllDestinationItem(): ArrayList<Destination> {
        dataDestinationTitle = resources.getStringArray(R.array.destinationTitle)
        dataDestinationDescription = resources.getStringArray(R.array.destinationDescription)
        dataDestinationImage = resources.obtainTypedArray(R.array.destinationImage)

        val destinations = ArrayList<Destination>()
        for (i in dataDestinationTitle.indices) {
            val listDestination = Destination (
                dataDestinationTitle[i],
                dataDestinationDescription[i],
                dataDestinationImage.getResourceId(i, -1)
            )
            destinations.add(listDestination)
        }
        return destinations
    }

    private fun showRecyclerListDestination() {
        rvDestination.setHasFixedSize(true)
        destination.addAll(getAllDestinationItem())

        rvDestination.layoutManager = LinearLayoutManager(activity)
        val destinationAdapter = ListDestinationAdapter(destination)
        rvDestination.adapter = destinationAdapter
    }
}