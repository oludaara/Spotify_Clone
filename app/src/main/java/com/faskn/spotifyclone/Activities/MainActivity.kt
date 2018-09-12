package com.faskn.spotifyclone.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.faskn.spotifyclone.Adapters.MyPagerAdapter
import com.faskn.spotifyclone.Data.RecentPlayedDTO
import com.faskn.spotifyclone.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentAdapter = MyPagerAdapter(supportFragmentManager)
        viewpager_main.adapter = fragmentAdapter
        tabs_main.setupWithViewPager(viewpager_main)
        setupIcons()


    }

    fun setupIcons(){

        tabs_main.getTabAt(0)!!.setIcon(R.drawable.home_btn)
        tabs_main.getTabAt(1)!!.setIcon(R.drawable.search)
        tabs_main.getTabAt(2)!!.setIcon(R.drawable.music_library_icon)
        tabs_main.getTabAt(3)!!.setIcon(R.drawable.browse_icon)
    }
}

