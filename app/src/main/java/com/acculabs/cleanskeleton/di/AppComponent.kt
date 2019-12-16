package com.acculabs.cleanskeleton.di

import android.app.Application
import com.acculabs.cleanskeleton.AppApplication
import com.acculabs.cleanskeleton.dataSource.testDataSource.TestDataProvider
import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {
    fun getApplication():Application
    fun inject(appApplication: AppApplication)
    fun inject(testDataProvider: TestDataProvider)
}