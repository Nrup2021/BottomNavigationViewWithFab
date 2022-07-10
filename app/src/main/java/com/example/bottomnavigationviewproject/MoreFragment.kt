package com.example.bottomnavigationviewproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.bottomnavigationviewproject.databinding.FragmentMoreBinding

class MoreFragment : Fragment() {
    private lateinit var binding: FragmentMoreBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMoreBinding.inflate(layoutInflater)
        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_moreFragment_to_moreDetailsFragment)
        }
        return binding.root
    }

}