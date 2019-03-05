package com.udacoding.wisatamvvmarcsimple.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import com.udacoding.wisatamvvmarcsimple.R
import com.udacoding.wisatamvvmarcsimple.model.DataItem
import kotlinx.android.synthetic.main.wisata_item.view.*

class WisataAdapter(val data : List<DataItem>) :RecyclerView.Adapter<WisataAdapter.MyHolder>(){
    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(get: DataItem) {
            itemView.itemLokasi.text = get.lokasi
            itemView.itemName.text = get.nama_tempat
            Picasso.get().load(get.gambar)
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(itemView.itemImg)

        }

    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int)
            = MyHolder(LayoutInflater.from(p0.context).inflate(R.layout.wisata_item,p0,false))


    override fun getItemCount(): Int {
        return data.size ?: 0
    }

    override fun onBindViewHolder(p0: WisataAdapter.MyHolder, p1: Int) {
        p0.bindView(data.get(p1))
    }

}