package com.example.fragmentdemo.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentdemo.R
import com.example.fragmentdemo.di.scope.FragmentScope
import com.example.fragmentdemo.navigation.Navigator
import com.example.fragmentdemo.navigation.NavigatorImpl

class MainActivity : AppCompatActivity() {

    private var navigator: Navigator? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigator = NavigatorImpl(supportFragmentManager, R.id.container)

        navigator?.addFragment(KittyFragment.newInstance(), false)
    }

    /**
     * Коллбек вызывающийся при нажатии кнопки "Назад"
     */
    override fun onBackPressed() {
        when {
            supportFragmentManager.backStackEntryCount == 1 -> {
                finish()
            }
            supportFragmentManager.backStackEntryCount > 1 -> {
                supportFragmentManager.popBackStack()
            }
            else -> {
                super.onBackPressed()
            }
        }
    }
}