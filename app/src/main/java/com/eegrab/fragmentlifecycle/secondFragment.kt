package com.eegrab.fragmentlifecycle

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.eegrab.fragmentlifecycle.databinding.FragmentSecondBinding


class secondFragment : Fragment(R.layout.fragment_second) {
    private lateinit var binding: FragmentSecondBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentSecondBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)

        binding.btnFirstNavigation.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_firstFragment)
        }
    }
}