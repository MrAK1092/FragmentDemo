package com.example.fragmentdemo.di

import com.example.fragmentdemo.data.auth.AuthApi
import com.example.fragmentdemo.data.auth.AuthApiImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Супер моудль с api
 */
@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideAuthApi(): AuthApi = AuthApiImpl()
}