package com.example.bottomnavigationviewproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.bottomnavigationviewproject.databinding.FragmentOffersBinding

class OffersFragment : Fragment() {
    private lateinit var binding: FragmentOffersBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOffersBinding.inflate(layoutInflater)
        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_offersFragment_to_offersDetailsFragment)
        }
        return binding.root
    }

}