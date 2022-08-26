package com.example.fragmentdemo.di

import com.example.fragmentdemo.App
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * AppComponent - это интерфейс содержащий в себе список модулей и зависимостей*
 */

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    RepositoryModule::class,
    NetworkModule::class,
    FragmentBindingModule::class
])

interface AppComponent : AndroidInjector<App>