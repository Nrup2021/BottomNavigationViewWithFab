package com.example.bottomnavigationviewproject

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import androidx.fragment.app.Fragment
import com.example.bottomnavigationviewproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpBottomNavigationView()
        setUpFabClick()

        val homeFragment = HomeFragment()
        val searchFragment = SearchFragment()
        val profileFragment = ProfileFragment()
        val settingsFragment = SettingsFragment()

        setCurrentFragment(homeFragment)

        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menuHome -> {
                    setCurrentFragment(homeFragment)
                }
                R.id.menuSearch -> {
                    setCurrentFragment(searchFragment)
                }
                R.id.menuProfile -> {
                    setCurrentFragment(profileFragment)
                }
                R.id.menuSettings -> {
                    setCurrentFragment(settingsFragment)
                }
            }
            true
        }
    }

    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayout, fragment)
            commit()
        }
    }

    private fun setUpFabClick() {
        binding.fabAdd.setOnClickListener {
            Toast.makeText(this@MainActivity, "Add new data", Toast.LENGTH_SHORT).show()
        }
    }

    private fun setUpBottomNavigationView() {
        binding.apply {
            bottomNavigationView.background = null
            bottomNavigationView.menu[2].isEnabled = false
        }
    }
}