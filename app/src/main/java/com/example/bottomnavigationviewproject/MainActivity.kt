package com.example.bottomnavigationviewproject

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.bottomnavigationviewproject.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        modifyBottomNavigationView()

        setUpFabClick()

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.navHostController) as NavHostFragment
        navController = navHostFragment.navController

        // Setup the bottom navigation view with navController
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.setupWithNavController(navController)

        // Setup the ActionBar with navController and 3 top level destinations
        appBarConfiguration = AppBarConfiguration(
            setOf(R.id.menuFragment, R.id.offersFragment, R.id.profileFragment, R.id.moreFragment)
        )

        setupActionBarWithNavController(navController, appBarConfiguration)

    }


    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration)
    }

    private fun setUpFabClick() {
        binding.fabAdd.setOnClickListener {
            Toast.makeText(this@MainActivity, "Add new data", Toast.LENGTH_SHORT).show()
        }
    }

    private fun modifyBottomNavigationView() {
        binding.apply {
            bottomNavigationView.background = null
            bottomNavigationView.menu[2].isEnabled = false
        }
    }

}

/**
 *
 * package com.example.bottomnavigationviewproject

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

val homeFragment = MenuFragment()
val offersFragment = OffersFragment()
val profileFragment = ProfileFragment()
val moreFragment = MoreFragment()

setCurrentFragment(homeFragment)

binding.bottomNavigationView.setOnItemSelectedListener { item ->
when (item.itemId) {
R.id.eMenu -> {
setCurrentFragment(homeFragment)
}
R.id.eOffers -> {
setCurrentFragment(offersFragment)
}
R.id.eProfile -> {
setCurrentFragment(profileFragment)
}
R.id.eMore -> {
setCurrentFragment(moreFragment)
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
 */