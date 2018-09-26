package com.faskn.spotifyclone.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.faskn.spotifyclone.R
import com.faskn.spotifyclone.data.CategoryDTO
import java.util.*

class SearchGridAdapter(val context: Context, val categoryList: ArrayList<CategoryDTO>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.search_titles_grid, parent, false)
        val categoryImg = view.findViewById<ImageView>(R.id.img_search_page_category)
        val categoryTxt = view.findViewById<TextView>(R.id.txt_search_category_title)
        Glide.with(categoryImg).load(when (categoryList[position].categoryTitle) {
            "Electronic/Dance" -> R.drawable.gradient_electronic_dance
            "Pop" -> R.drawable.gradient_pop
            "Indie/Alternatif" -> R.drawable.gradient_indie_alternatif
            "Hip Hop" -> R.drawable.gradient_hip_hop
            "Yeni Çıkanlar" -> R.drawable.gradient_yeni_cikanlar
            "Listeler" -> R.drawable.gradient_listeler
            "Podcast'ler" -> R.drawable.gradient_podcastler
            "Yaz" -> R.drawable.gradient_yaz
            "Modlar" -> R.drawable.gradient_modlar
            "Odaklan" -> R.drawable.gradient_odaklan
            "Pride" -> R.drawable.gradient_pride
            "Chill" -> R.drawable.gradient_chill
            "Romantik" -> R.drawable.gradient_romantik
            "Fitness" -> R.drawable.gradient_fitness
            "Rock" -> R.drawable.gradient_rock
            "Uyku" -> R.drawable.gradient_uyku
            "Dönem Müzikleri" -> R.drawable.gradient_donem_muzikleri
            "Klasik" -> R.drawable.gradient_klasik
            "Parti" -> R.drawable.gradient_parti
            "Caz" -> R.drawable.gradient_caz
            "Blues" -> R.drawable.gradient_blues
            "Soul" -> R.drawable.gradient_soul
            "K-pop" -> R.drawable.gradient_k_pop
            "RnB" -> R.drawable.gradient_rnb
            "Oyunlar" -> R.drawable.gradient_oyunlar
            "Seyahat" -> R.drawable.gradient_seyahat
            "Metal" -> R.drawable.gradient_metal
            "Country" -> R.drawable.gradient_country
            "Reggae" -> R.drawable.gradient_reggae
            "Akşam Yemeği" -> R.drawable.gradient_aksam_yemegi
            "Latin" -> R.drawable.gradient_latin
            "Komedi" -> R.drawable.gradient_komedi
            "Funk" -> R.drawable.gradient_funk
            "Folk & Acoustic" -> R.drawable.gradient_folk
            "Çocuk" -> R.drawable.gradient_cocuk
            "Punk" -> R.drawable.gradient_punk
            "Trending" -> R.drawable.gradient_trending
            "WHM" -> R.drawable.gradient_whm
            else -> null
        }).into(categoryImg)
        categoryTxt.text = categoryList[position].categoryTitle

        return view
    }

    override fun getItem(position: Int): Any {
        return categoryList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return categoryList.size
    }


}