package com.example.labactivity4_1

import android.app.Application

open class LabApplication : Application() {
    lateinit var textProvider: TextProvider
    lateinit var listLoader: ListLoader

    override fun onCreate() {
        super.onCreate()
        textProvider = TextProvider(this)
        listLoader = ListLoader()
    }
}