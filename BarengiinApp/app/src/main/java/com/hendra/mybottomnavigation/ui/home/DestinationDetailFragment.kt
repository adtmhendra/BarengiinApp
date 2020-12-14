package com.hendra.mybottomnavigation.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.hendra.mybottomnavigation.R
import com.hendra.mybottomnavigation.model.Destination
import kotlinx.android.synthetic.main.destination_rows.*
import kotlinx.android.synthetic.main.fragment_destination_detail.*

class DestinationDetailFragment : Fragment() {

    companion object {
        const val EXTRA_DATA = "extra_data"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_destination_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity).supportActionBar?.hide()

        val destination = (activity as AppCompatActivity).intent.getParcelableExtra(EXTRA_DATA) as? Destination

        tvTitleDestination.text = destination?.title.toString()
        tvDetailDescription.text = destination?.description.toString()

    }
}