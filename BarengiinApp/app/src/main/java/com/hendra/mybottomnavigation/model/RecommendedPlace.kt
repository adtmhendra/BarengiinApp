package com.hendra.mybottomnavigation.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class RecommendedPlace (
    var title: String,
    var image: Int
) : Parcelable