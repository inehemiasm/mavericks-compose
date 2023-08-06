package com.example.testapp

import android.app.Application
import com.airbnb.mvrx.Mavericks


class CounterApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Mavericks.initialize(this)
    }
}