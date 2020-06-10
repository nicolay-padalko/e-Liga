package com.example.e_liga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener {
        when(it.itemId) {
            R.id.nav_home -> {
                println("casa")
                replaceFragment(HomeFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_ajuda -> {
                println("ajuda")
                replaceFragment(AjudaFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_adiciona -> {
                println("adiciona")
                replaceFragment(AdicionaFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_config -> {
                println("config")
                replaceFragment(ConfigFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_compra -> {
                println("compra")
                replaceFragment(CompraFragment())
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        replaceFragment(HomeFragment())
    }

    private fun replaceFragment( fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }
}
