package com.example.fragmentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.fragmentdemo.databinding.FragmentCounterBinding
import com.example.fragmentdemo.navigation.Navigator
import com.example.fragmentdemo.navigation.NavigatorImpl

class CounterFragment : Fragment(R.layout.fragment_counter) {

    private val binding by viewBinding(FragmentCounterBinding::bind)
    private var navigator: Navigator? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
        navigator = NavigatorImpl(parentFragmentManager, R.id.container)
    }

    private fun initListeners() {
        binding.btnBack.setOnClickListener { navigator?.popBack() }
    }

    companion object {

        fun newInstance() = CounterFragment()
    }
}