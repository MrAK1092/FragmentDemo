package com.example.fragmentdemo

import com.example.fragmentdemo.di.AppComponent
import com.example.fragmentdemo.di.AppModule
import com.example.fragmentdemo.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

/**
 * Класс приложенгия
 */
class App : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .build()
        return appComponent
    }

    companion object {

        lateinit var appComponent: AppComponent
    }
}