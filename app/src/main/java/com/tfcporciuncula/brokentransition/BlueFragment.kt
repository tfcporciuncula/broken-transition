package com.tfcporciuncula.brokentransition

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tfcporciuncula.brokentransition.databinding.FragmentBlueBinding

class BlueFragment : Fragment(R.layout.fragment_blue) {

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    val binding = FragmentBlueBinding.bind(view)
    binding.button.setOnClickListener { findNavController().navigate(BlueFragmentDirections.toRedFragment()) }
  }
}
