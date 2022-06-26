package com.muhammed.concatadapter.ui.home.header

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.muhammed.concatadapter.databinding.ItemParentHeaderBinding

/**
 * Created by Muhammed COBANOGLU on 25.06.2022.
 */
class HeaderAdapter(private val adapter: HeaderItemAdapter) :
    RecyclerView.Adapter<HeaderAdapter.ViewHolder>() {

    class ViewHolder(private val binding: ItemParentHeaderBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(adapter: HeaderItemAdapter) {
            val context = binding.root.context
            binding.headerList.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            binding.headerList.addItemDecoration(
                DividerItemDecoration(
                    binding.headerList.context,
                    (binding.headerList.layoutManager as LinearLayoutManager).orientation
                )
            )
            binding.headerList.adapter = adapter
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemParentHeaderBinding.inflate(layoutInflater, parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(adapter)
    }

    override fun getItemCount(): Int = 1
}