package com.example.homework3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.homework3.R
import com.example.homework3.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        val rootView = binding.root

        val firstNameTextView = binding.nametxt
        val lastNameTextView = binding.surnametxt
        val gpaTextView = binding.gpatxt

        val args: ProfileFragmentArgs by navArgs()
        val firstName = args.firstName
        val lastName = args.lastName
        val gpa = args.gpa

        firstNameTextView.text = firstName
        lastNameTextView.text = lastName
        gpaTextView.text = gpa.toString()

        return rootView
    }
}