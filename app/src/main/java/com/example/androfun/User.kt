package com.example.androfun

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize

data class User(
    val userName: String,
    val password: String
):Parcelable
