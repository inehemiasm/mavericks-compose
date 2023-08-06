package com.example.testapp.data

import com.airbnb.mvrx.MavericksState
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import com.airbnb.mvrx.MavericksViewModel
import com.airbnb.mvrx.compose.collectAsState
import com.airbnb.mvrx.compose.mavericksActivityViewModel
import com.airbnb.mvrx.compose.mavericksViewModel

data class CounterState(
    val count: Int = 0,
) : MavericksState {
    @Suppress("unused")
    constructor(arguments: ArgumentsTest) : this(count = arguments.count)
}