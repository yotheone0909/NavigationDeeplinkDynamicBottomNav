package com.example.navigationdeeplink

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private val shareViewModel: SecondViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainer) as NavHostFragment
        val navController = navHostFragment.navController
        findViewById<BottomNavigationView>(R.id.bottomNav).setupWithNavController(navController)

        shareViewModel.getType()
//        val navGraph = navController.graph
//        val navSecondDestination = navGraph.findNode(R.id.nav_second)

//        Log.d("YOYOYOYOYOYOYOYOYOY", "${navGraph.startDestDisplayName}")
//        shareViewModel.onGetTypeSecond.observe(this) {
//            if (it) {
//                navSecondDestination?.id = R.id.secondTypeOneFragment
//                Log.d("YOYOYOYOYOYOYOYOYOY", "${navGraph.startDestDisplayName}")
//            } else {
//                navSecondDestination?.id = R.id.secondTypeOneFragment
//                Log.d("YOYOYOYOYOYOYOYOYOY", "${navGraph.startDestDisplayName}")
//            }
//            navController.graph = navGraph
//        }
//
//        navController.addOnDestinationChangedListener { controller, destination, arguments ->
//            if (destination.id == R.id.nav_second) {
//                Log.d("YOYOYOYOYOYOYOYOYOY", "YOYOYOYOYOYOYOYOYOY")
//            }
//        }
    }
}