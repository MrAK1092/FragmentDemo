package com.example.fragmentdemo.di.screen_modules

import com.example.fragmentdemo.di.scope.FragmentScope
import com.example.fragmentdemo.domain.auth.AuthInteractor
import com.example.fragmentdemo.domain.auth.AuthInteractorImpl
import dagger.Binds
import dagger.Module

/**
 * Модуль экрана Kitty
 */
@Module
abstract class KittyScreenModule {

    /**
     * Binds - дать даггеру возможность инжектить [AuthInteractor]
     * FragmentScope - жизненный цикл [AuthInteractor]
     */
    @Binds
    @FragmentScope
    abstract fun bindAuthInteractor(authInteractor: AuthInteractorImpl): AuthInteractor
}