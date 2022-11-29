package com.bignerdrunch.android.snitch

import android.app.Application

class SnitchApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}