package com.example.fragmentdemo.navigation

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

/**
 * Имплеминтация интерфейса [Navigator]
 * @property fm Фрагмент менеджер
 * @property containerId контейнер для открытия фрагментов
 */
class NavigatorImpl(
    private val fm: FragmentManager,
    private val containerId: Int) : Navigator {

    override fun addFragment(fragment: Fragment, addToBackStack: Boolean) {
        fm.beginTransaction().apply {
            add(containerId, fragment)
            if (addToBackStack) addToBackStack(null)
            commit()
        }
    }

    override fun replaceFragment(fragment: Fragment, addToBackStack: Boolean) {
        fm.beginTransaction().apply {
            replace(containerId, fragment)
            if (addToBackStack) addToBackStack(null)
            commit()
        }
    }

    override fun popBack() {
        if (fm.fragments.isNotEmpty()) {
            fm.fragments.first().requireActivity().onBackPressed()
        }
    }
}