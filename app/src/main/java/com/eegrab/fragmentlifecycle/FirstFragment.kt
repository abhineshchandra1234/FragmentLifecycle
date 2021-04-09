package com.eegrab.fragmentlifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.eegrab.fragmentlifecycle.databinding.FragmentFirstBinding

class FirstFragment : Fragment(R.layout.fragment_first) {
    private lateinit var binding: FragmentFirstBinding

    val TAG = "Main"
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "onAttach: is called")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: is called")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentFirstBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated: is called")

        binding.btnSecondNavigation.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "onCreateView: is called")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAG, "onActivityCreated: is called")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: is called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: is called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: is called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: is called")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView: is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: is called")
    }
}