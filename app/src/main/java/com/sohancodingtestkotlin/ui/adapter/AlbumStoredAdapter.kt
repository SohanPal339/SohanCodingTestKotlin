package com.sohancodingtestkotlin.ui.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.sohancodingtestkotlin.R
import com.sohancodingtestkotlin.db.entity.AlbumEntity
import com.sohancodingtestkotlin.toBitmap
import com.sohancodingtestkotlin.ui.listener.OnClickStoredAlbumListener



class AlbumStoredAdapter(private val dataList: List<AlbumEntity>,
                         private val onClickListener: OnClickStoredAlbumListener
) :
        RecyclerView.Adapter<AlbumStoredAdapter.AlbumViewHolder>() {

    var mContext: Context? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        mContext = parent.context

        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.custom_view_top_album, parent, false)
        return AlbumViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        holder.textAlbum.text = dataList[position].name
        holder.imageAlbum.setImageBitmap(dataList[position].image.toBitmap())

        holder.itemView.setOnClickListener {
            onClickListener.onClick(position)
        }

    }

    override fun getItemCount(): Int {
        return dataList.size
    }

      inner class AlbumViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

          var textAlbum: TextView
          var imageAlbum: ImageView

          init {
              textAlbum = itemView.findViewById(R.id.textAlbum)
              imageAlbum = itemView.findViewById(R.id.imageAlbum)
          }
    }
}