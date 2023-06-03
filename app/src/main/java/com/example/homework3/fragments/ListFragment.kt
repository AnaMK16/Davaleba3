package com.example.homework3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.homework3.R
import com.example.homework3.databinding.FragmentListBinding

class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentListBinding.inflate(inflater, container, false)
        val rootView = binding.root

        val homeImageView = binding.homeImageView
        val profileImageView = binding.profileImageView

        homeImageView.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_homeFragment)
        }

        profileImageView.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_profileFragment)
        }

        return rootView
    }
}
