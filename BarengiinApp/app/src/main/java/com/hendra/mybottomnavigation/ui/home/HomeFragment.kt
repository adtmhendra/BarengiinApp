package com.hendra.mybottomnavigation.ui.home

import android.content.res.TypedArray
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.hendra.mybottomnavigation.R
import com.hendra.mybottomnavigation.adapter.ListNewsAdapter
import com.hendra.mybottomnavigation.adapter.ListRecommendedPlaceAdapter
import com.hendra.mybottomnavigation.model.News
import com.hendra.mybottomnavigation.model.RecommendedPlace
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private val places = ArrayList<RecommendedPlace>()
    private val allNews = ArrayList<News>()
    private lateinit var dataNewsTitle: Array<String>
    private lateinit var dataNewsImage: TypedArray
    private lateinit var dataRecommendedPlaceTitle: Array<String>
    private lateinit var dataRecommendedPlaceImage: TypedArray

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)

        rvNews.setHasFixedSize(true)
        allNews.addAll(getAllNewsItem())
        showRecyclerListNews()

        rvDestinasiWisata.setHasFixedSize(true)
        places.addAll(getAllRecommendedPlaceItem())
        showRecyclerListPlaces()

        navigation()
    }

    private fun getAllNewsItem(): ArrayList<News> {
        dataNewsTitle = resources.getStringArray(R.array.newsTitle)
        dataNewsImage = resources.obtainTypedArray(R.array.newsImage)

        val news = ArrayList<News>()
        for (i in dataNewsTitle.indices) {
            val listNews = News (
            dataNewsTitle[i],
            dataNewsImage.getResourceId(i, -1)
            )
            news.add(listNews)
        }
        return news
    }

    private fun getAllRecommendedPlaceItem(): ArrayList<RecommendedPlace> {
        dataRecommendedPlaceTitle = resources.getStringArray(R.array.recommendedTitle)
        dataRecommendedPlaceImage = resources.obtainTypedArray(R.array.recommendedImage)

        val places = ArrayList<RecommendedPlace>()
        for (i in dataRecommendedPlaceTitle.indices) {
            val listPlace = RecommendedPlace (
                dataRecommendedPlaceTitle[i],
                dataRecommendedPlaceImage.getResourceId(i, -1)
            )
            places.add(listPlace)
        }
        return places
    }

    private fun showRecyclerListNews() {
        rvNews.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        val listNewsAdapter = ListNewsAdapter(allNews)
        rvNews.adapter = listNewsAdapter
    }

    private fun showRecyclerListPlaces() {
        rvDestinasiWisata.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        val listRecommendedPlaceAdapter = ListRecommendedPlaceAdapter(places)
        rvDestinasiWisata.adapter = listRecommendedPlaceAdapter
    }

    private fun navigation() {
        cardViewWisata.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_navigation_beranda_to_destinationFragment)
        )

        cardViewTumpangan.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_navigation_beranda_to_tumpanganActivity)
        )
    }
}