package com.example.tablayoutwithviewpagerdemo

import android.content.Context
import androidx.fragment.app.FragmentPagerAdapter

class MyAdapter(private val myContext: Context, fm: androidx.fragment.app.FragmentManager, internal var totalTabs: Int) : FragmentPagerAdapter(fm) {

    // this is for fragment tabs
    override fun getItem(position: Int): androidx.fragment.app.Fragment {
        when (position) {
            0 -> {
                //  val homeFragment: HomeFragment = HomeFragment()
                return JavaFragment()
            }
            1 -> {
                return AndroidFragment()
            }
            else -> {
                // val movieFragment = MovieFragment()
                return KotlinFragment()
            }
        }
    }

    // this counts total number of tabs
    override fun getCount(): Int {
        return totalTabs
    }
}