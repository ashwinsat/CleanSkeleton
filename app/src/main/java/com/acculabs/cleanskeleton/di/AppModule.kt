package com.acculabs.cleanskeleton.di

import android.app.Application
import android.content.res.AssetManager
import com.acculabs.cleanskeleton.AppApplication
import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Provides
    fun provideApplication() = AppApplication.getApplication() as Application

    @Provides
    fun provideAssetManager(application: Application) = application.assets
}