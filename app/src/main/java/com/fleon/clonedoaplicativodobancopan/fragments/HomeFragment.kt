package com.fleon.clonedoaplicativodobancopan.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.fleon.clonedoaplicativodobancopan.R
import com.fleon.clonedoaplicativodobancopan.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private var homeBinding: FragmentHomeBinding? = null
    private val binding get() = homeBinding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        homeBinding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.cvCard.setOnClickListener{
            it.findNavController().navigate(R.id.action_homeFragment_to_cardFragment)
        }

        binding.cvApplyInvestments.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_investmentsFragment)
        }

    }
}