package com.acculabs.cleanskeleton

import android.app.Application

class AppApplication : Application() {
    init {
        appApplication = this
    }

    companion object {
        private var appApplication: AppApplication? = null
        fun getApplication() = appApplication?.applicationContext!!
    }

    override fun onCreate() {
        super.onCreate()
        appApplication = this
    }
}