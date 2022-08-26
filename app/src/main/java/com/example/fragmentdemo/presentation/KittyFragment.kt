package com.example.fragmentdemo.presentation

import android.os.Bundle
import android.util.Log
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.fragmentdemo.R
import com.example.fragmentdemo.data.auth.AuthApiImpl
import com.example.fragmentdemo.data.auth.AuthRepositoryImpl
import com.example.fragmentdemo.databinding.FragmentKittyBinding
import com.example.fragmentdemo.domain.auth.AuthInteractor
import com.example.fragmentdemo.domain.auth.AuthInteractorImpl
import com.example.fragmentdemo.navigation.Navigator
import com.example.fragmentdemo.navigation.NavigatorImpl
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class KittyFragment : DaggerFragment(R.layout.fragment_kitty) {

    /**
     * Инъекция нашего ебучего интерактора
     */
    @Inject
    lateinit var authInteractor: AuthInteractor

    private val binding by viewBinding(FragmentKittyBinding::bind)
    private var navigator: Navigator? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navigator = NavigatorImpl(parentFragmentManager, R.id.container)
        initListeners()
    }

    private fun initListeners() {
        binding.apply {
            imageButton.setOnClickListener {
                //helloText.text = "СТРЕЛЬНУТЬ СИЖКУ"
                //navigator?.addFragment(CounterFragment.newInstance())
                val isAuth = authInteractor.auth("+79194608899")
                Log.e("TAG", "isAuth $isAuth" )
            }
            btnBack.setOnClickListener { navigator?.popBack() }
        }
    }

    companion object {

        fun newInstance(): KittyFragment = KittyFragment()
    }
}