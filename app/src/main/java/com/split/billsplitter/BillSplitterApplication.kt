package com.split.billsplitter

import android.app.Application

class BillSplitterApplication : Application() {

    lateinit var applicationComponent = ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.factory().create(applicationContext)
    }
}