package com.example.fragmentdemo.navigation

import androidx.fragment.app.Fragment

interface Navigator {

    /**
     * Доабвить фрагмент
     * @param fragment Фрагмент
     * @param addToBackStack добавить фрагмент в стек, по-умолчанию true
     */
    fun addFragment(
        fragment: Fragment,
        addToBackStack: Boolean = true)

    /**
     * TODO
     */
    fun replaceFragment(
        fragment: Fragment,
        addToBackStack: Boolean = true)

    /**
     * закрыть фрагмент
     */
    fun popBack()
}