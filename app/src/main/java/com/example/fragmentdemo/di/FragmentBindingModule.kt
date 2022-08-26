package com.example.fragmentdemo.di

import com.example.fragmentdemo.di.scope.FragmentScope
import com.example.fragmentdemo.di.screen_modules.KittyScreenModule
import com.example.fragmentdemo.presentation.KittyFragment
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

/**
 * Супер модуль для байнда фрагментов
 */
@Module
interface FragmentBindingModule {

    /**
     * FragmentScope - жизненный цикл инъекций
     * ContributesAndroidInjector - модули, в которых будут браться объекты для инъекций
     */
    @FragmentScope
    @ContributesAndroidInjector(modules = [KittyScreenModule::class])
    fun bindKittyFragment(): KittyFragment
}