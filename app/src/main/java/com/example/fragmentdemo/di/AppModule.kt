package com.example.fragmentdemo.di

import android.app.Application
import android.content.Context
import com.example.fragmentdemo.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Супер модуль проиложения для работы с контекстом
 */
@Module
class AppModule(var appContext: Context) {

    @Singleton
    @Provides
    fun provideContext(): Context = appContext

    @Singleton
    @Provides
    fun provideApplication(): App = appContext as App
}