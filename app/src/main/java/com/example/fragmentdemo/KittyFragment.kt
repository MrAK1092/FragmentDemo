package com.example.fragmentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.fragmentdemo.databinding.ActivityMainBinding
import com.example.fragmentdemo.databinding.FragmentKittyBinding


class KittyFragment : Fragment() {


    lateinit var mHelloTextView: TextView
    lateinit var imageButton: ImageButton
    lateinit var binding: FragmentKittyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentKittyBinding.inflate(layoutInflater)

        mHelloTextView = binding.helloText




        var b = binding
        binding.imageButton.setOnClickListener {
            mHelloTextView.setText("СТРЕЛЬНУТЬ СИЖКУ")
        }

        binding.helloText.text
        binding.imageButton


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kitty, container, false)
    }

    companion object {

    }
}