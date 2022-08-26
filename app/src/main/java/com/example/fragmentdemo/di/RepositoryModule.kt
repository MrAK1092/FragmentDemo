package com.example.fragmentdemo.di

import com.example.fragmentdemo.data.auth.AuthApi
import com.example.fragmentdemo.data.auth.AuthRepositoryImpl
import com.example.fragmentdemo.domain.auth.AuthRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Супер моудль с репозиториями
 */
@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun provideUthRepository(
        authApi: AuthApi
    ): AuthRepository = AuthRepositoryImpl(authApi)
}