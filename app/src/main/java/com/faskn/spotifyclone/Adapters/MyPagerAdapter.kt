package com.faskn.spotifyclone.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.faskn.spotifyclone.Fragments.HomeFragment
import com.faskn.spotifyclone.Fragments.LibraryFragment
import com.faskn.spotifyclone.Fragments.PremiumFragment
import com.faskn.spotifyclone.Fragments.SearchFragment

class MyPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm){
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                HomeFragment()
            }
            1 ->{
                SearchFragment()
            }

            2 -> {
                LibraryFragment()
            }
            else -> {
                return PremiumFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 4
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when(position){
            0 -> "Anasayfa"
            1 -> "Ara"
            2 -> "Kitaplığın"
            else -> {
                return "Premium" }
        }

    }
}