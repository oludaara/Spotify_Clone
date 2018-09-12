package com.faskn.spotifyclone.Fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.faskn.spotifyclone.Adapters.RecentRecyclerAdapter
import com.faskn.spotifyclone.Adapters.MyPagerAdapter
import com.faskn.spotifyclone.Data.RecentPlayedDTO

import com.faskn.spotifyclone.R

class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment


        var view : View = inflater.inflate(R.layout.fragment_home, container, false)
        var recycler = view.findViewById<RecyclerView>(R.id.recently_played_recycler)
        recycler?.layoutManager = LinearLayoutManager(view.context, LinearLayout.HORIZONTAL,false)

        val albums = ArrayList<RecentPlayedDTO>()
        albums.add(RecentPlayedDTO("https://www.shareicon.net/download/2016/09/01/822725_user_512x512.png","Senin için"))
        albums.add(RecentPlayedDTO("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNb6KAhak0TUASceMFbSCwoUhFcPCla__6nw2QFHhiIRPeen6UEA","Güldürü"))
        albums.add(RecentPlayedDTO("https://www.walldevil.com/wallpapers/w01/547971-brz-cars-fr-s-gt-86-scion-scion-fr-s-subaru-brz-toyota-86.jpg","Araba"))
        albums.add(RecentPlayedDTO("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQRRe1ZmUqQCHo_VzWRK0ALyLxAShAOLF0UFflxFEQNAFPnkN7V","Fitness"))
        albums.add(RecentPlayedDTO("https://images.wallpaperscraft.com/image/spices_seasonings_red_pepper_black_pepper_pepper_star_anise_onion_ginger_garlic_walnuts_bay_leaf_78738_300x168.jpg","Yemek"))
        albums.add(RecentPlayedDTO("http://s1.1zoom.me/b5050/934/DOTA_2_Magnus_Monsters_444888_1366x768.jpg","Oyun"))
        albums.add(RecentPlayedDTO("https://stoketravel.com/wp-content/uploads/2016/12/solo-travel-photo-.jpg","Seyahat"))

        var adapter = RecentRecyclerAdapter(albums)
        recycler?.adapter=adapter

        return view
    }


}
