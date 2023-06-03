package com.example.homework3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.homework3.R
import com.example.homework3.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        val rootView = binding.root

        val transferButton = binding.transferButton
        val goToListButton = binding.goToListButton

        transferButton.setOnClickListener {
            val firstName = binding.name.text.toString()
            val lastName = binding.surname.text.toString()
            val gpa = binding.GPA.text.toString().toFloat()

            val action = HomeFragmentDirections.actionHomeFragmentToProfileFragment(firstName, lastName, gpa)
            findNavController().navigate(action)
        }

        transferButton.setOnLongClickListener {
            binding.name.text.clear()
            binding.surname.text.clear()
            binding.GPA.text.clear()
            true
        }

        goToListButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_listFragment)
        }

        return rootView
    }
}