package com.faskn.spotifyclone.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import androidx.fragment.app.Fragment
import com.faskn.spotifyclone.R
import com.faskn.spotifyclone.adapters.SearchGridAdapter
import com.faskn.spotifyclone.data.CategoryDTO


class SearchFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_search, container, false)
        val feeds = ArrayList<CategoryDTO>()


        feeds.add(CategoryDTO("", "Electronic/Dance"))
        feeds.add(CategoryDTO("", "Pop"))
        feeds.add(CategoryDTO("", "Indie/Alternatif"))
        feeds.add(CategoryDTO("", "Hip Hop"))
        feeds.add(CategoryDTO("", "Yeni Çıkanlar"))
        feeds.add(CategoryDTO("", "Listeler"))
        feeds.add(CategoryDTO("", "Podcast'ler"))
        feeds.add(CategoryDTO("", "Yaz"))
        feeds.add(CategoryDTO("", "Modlar"))
        feeds.add(CategoryDTO("", "Odaklan"))
        feeds.add(CategoryDTO("", "Pride"))
        feeds.add(CategoryDTO("", "Chill"))
        feeds.add(CategoryDTO("", "Romantik"))
        feeds.add(CategoryDTO("", "Fitness"))
        feeds.add(CategoryDTO("", "Rock"))
        feeds.add(CategoryDTO("", "Uyku"))
        feeds.add(CategoryDTO("", "Dönem Müzikleri"))
        feeds.add(CategoryDTO("", "Klasik"))
        feeds.add(CategoryDTO("", "Parti"))
        feeds.add(CategoryDTO("", "Caz"))
        feeds.add(CategoryDTO("", "Blues"))
        feeds.add(CategoryDTO("", "Soul"))
        feeds.add(CategoryDTO("", "K-pop"))
        feeds.add(CategoryDTO("", "RnB"))
        feeds.add(CategoryDTO("", "Oyunlar"))
        feeds.add(CategoryDTO("", "Seyahat"))
        feeds.add(CategoryDTO("", "Metal"))
        feeds.add(CategoryDTO("", "Country"))
        feeds.add(CategoryDTO("", "Reggae"))
        feeds.add(CategoryDTO("", "Akşam Yemeği"))
        feeds.add(CategoryDTO("", "Latin"))
        feeds.add(CategoryDTO("", "Komedi"))
        feeds.add(CategoryDTO("", "Funk"))
        feeds.add(CategoryDTO("", "Folk & Acoustic"))
        feeds.add(CategoryDTO("", "Çocuk"))
        feeds.add(CategoryDTO("", "Punk"))
        feeds.add(CategoryDTO("", "Trending"))
        feeds.add(CategoryDTO("", "WHM"))

        val searchCategoryGrid = view.findViewById<GridView>(R.id.search_page_grid) as GridView
        val adapter = SearchGridAdapter(view.context, feeds)
        searchCategoryGrid.adapter = adapter

        return view
    }


}
