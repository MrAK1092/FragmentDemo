package com.example.fragmentdemo.di.scope

import javax.inject.Scope

/**
 * Аннтоация для помечения жизненного цикла объекта для инъекции
 */
@Scope
@Retention(value = AnnotationRetention.RUNTIME)
annotation class FragmentScope