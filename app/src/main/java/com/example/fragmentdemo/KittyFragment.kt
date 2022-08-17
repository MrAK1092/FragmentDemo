package com.example.fragmentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.fragmentdemo.databinding.FragmentKittyBinding
import com.example.fragmentdemo.navigation.Navigator
import com.example.fragmentdemo.navigation.NavigatorImpl

class KittyFragment : Fragment(R.layout.fragment_kitty) {

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
                navigator?.addFragment(CounterFragment.newInstance())
            }
            btnBack.setOnClickListener { navigator?.popBack() }
        }
    }

    companion object {

        fun newInstance(): KittyFragment = KittyFragment()
    }
}