package com.example.bottomnavigationviewproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bottomnavigationviewproject.databinding.FragmentProfileDetailsBinding

class ProfileDetailsFragment : Fragment() {
    private lateinit var binding: FragmentProfileDetailsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileDetailsBinding.inflate(layoutInflater)
        return binding.root
    }

}