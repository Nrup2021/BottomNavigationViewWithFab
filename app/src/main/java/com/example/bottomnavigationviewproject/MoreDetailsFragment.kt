package com.example.bottomnavigationviewproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bottomnavigationviewproject.databinding.FragmentMoreDetailsBinding

class MoreDetailsFragment : Fragment() {
    private lateinit var binding: FragmentMoreDetailsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMoreDetailsBinding.inflate(layoutInflater)
        return binding.root
    }

}