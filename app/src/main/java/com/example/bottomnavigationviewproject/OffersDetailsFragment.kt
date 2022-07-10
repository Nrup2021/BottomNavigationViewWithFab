package com.example.bottomnavigationviewproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bottomnavigationviewproject.databinding.FragmentOffersDetailsBinding

class OffersDetailsFragment : Fragment() {
   private lateinit var binding: FragmentOffersDetailsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOffersDetailsBinding.inflate(layoutInflater)
        return binding.root
    }

}