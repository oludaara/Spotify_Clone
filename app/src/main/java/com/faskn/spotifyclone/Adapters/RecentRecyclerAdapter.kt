package com.faskn.spotifyclone.Adapters

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.faskn.spotifyclone.Data.RecentPlayedDTO
import com.faskn.spotifyclone.R
import kotlinx.android.synthetic.main.container_recently_played.view.*

class RecentRecyclerAdapter(val recentPlayedList : ArrayList<RecentPlayedDTO>) : RecyclerView.Adapter<RecentRecyclerAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecentRecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.container_recently_played, parent, false)
        return ViewHolder(v);
    }

    override fun getItemCount(): Int {
        return recentPlayedList.size
    }

    override fun onBindViewHolder(holder: RecentRecyclerAdapter.ViewHolder, position: Int) {
        val imgAlbumCover = holder.itemView.findViewById<ImageView>(R.id.imgAlbumCover)
        Glide.with(holder.itemView).load(recentPlayedList[position].imgURL).into(imgAlbumCover)
        holder.txtAlbumTitle?.text=recentPlayedList[position].title
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imgAlbumCover = itemView.findViewById<ImageView>(R.id.imgAlbumCover)
        val txtAlbumTitle = itemView.findViewById<TextView>(R.id.txtAlbumTitle)
    }

}