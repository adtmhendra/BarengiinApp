package com.hendra.mybottomnavigation.ui.favourite

import android.content.res.TypedArray
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.hendra.mybottomnavigation.R
import com.hendra.mybottomnavigation.adapter.ListFavoriteAdapter
import com.hendra.mybottomnavigation.model.Favorite
import kotlinx.android.synthetic.main.fragment_favourite.*

class FavouriteFragment : Fragment() {

    private val listFavorite = ArrayList<Favorite>()
    private lateinit var dataFavoriteTitle: Array<String>
    private lateinit var dataFavoriteImage: TypedArray

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_favourite, container, false)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)

        showRecyclerListFavorite()
    }

    private fun getAllFavoriteItem(): ArrayList<Favorite> {

        dataFavoriteTitle = resources.getStringArray(R.array.favoriteTitle)
        dataFavoriteImage = resources.obtainTypedArray(R.array.favoriteImage)

        val favorite = ArrayList<Favorite>()
        for (i in dataFavoriteTitle.indices) {
            val listFavorite = Favorite(
                dataFavoriteTitle[i],
                dataFavoriteImage.getResourceId(i, -1)
            )
            favorite.add(listFavorite)
        }
        return favorite
    }

    private fun showRecyclerListFavorite() {
        rvFavorite.setHasFixedSize(true)
        listFavorite.addAll(getAllFavoriteItem())
        rvFavorite.layoutManager = LinearLayoutManager(context)
        val listFavoriteAdapter = ListFavoriteAdapter(listFavorite)
        rvFavorite.adapter = listFavoriteAdapter
    }
}