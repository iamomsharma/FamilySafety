package com.example.familysefty

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.familysefty.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.bottomNavigation.setOnItemSelectedListener {
            when(it.itemId)
            {
                R.id.nav_home -> callFragment(HomeFragment.newInstance())
                R.id.nav_dashboard -> callFragment(GuardFragment.newInstance())
                R.id.nav_guard -> callFragment(GuardFragment.newInstance())
                R.id.nav_user -> callFragment(GuardFragment.newInstance())
            }
            true
        }

        binding.bottomNavigation.selectedItemId = R.id.nav_home

    }

    fun callFragment(fragment: Fragment)
    {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frameContainer, fragment)
        transaction.commit()
    }
}