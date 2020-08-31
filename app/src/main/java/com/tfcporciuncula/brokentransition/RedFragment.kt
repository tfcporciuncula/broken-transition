package com.tfcporciuncula.brokentransition

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tfcporciuncula.brokentransition.databinding.FragmentRedBinding

class RedFragment : Fragment(R.layout.fragment_red) {

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    val binding = FragmentRedBinding.bind(view)
    binding.button.setOnClickListener { findNavController().navigateUp() }
  }
}
