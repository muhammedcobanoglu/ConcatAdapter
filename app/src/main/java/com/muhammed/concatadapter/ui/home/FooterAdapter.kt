package com.muhammed.concatadapter.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muhammed.concatadapter.databinding.ItemFooterBinding

/**
 * Created by Muhammed COBANOGLU on 25.06.2022.
 */
class FooterAdapter() :
    RecyclerView.Adapter<FooterAdapter.ViewHolder>() {

    class ViewHolder(binding: ItemFooterBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemFooterBinding.inflate(layoutInflater, parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {}

    override fun getItemCount(): Int = 1
}