package com.hendra.mybottomnavigation.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Destination (
    var title: String,
    var description: String,
    var image: Int
) : Parcelable