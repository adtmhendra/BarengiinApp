package com.hendra.mybottomnavigation.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Favorite (
    var title: String,
    var image: Int
) : Parcelable