package com.muhammed.concatadapter.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muhammed.concatadapter.data.Fruit
import com.muhammed.concatadapter.databinding.ItemHomeBinding

/**
 * Created by Muhammed COBANOGLU on 25.06.2022.
 */
class BodyAdapter(private val dataList: List<Fruit>) :
    RecyclerView.Adapter<BodyAdapter.ViewHolder>() {

    class ViewHolder(private val binding: ItemHomeBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(fruit: Fruit) {
            binding.fruit = fruit
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemHomeBinding.inflate(layoutInflater, parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(dataList[position])

    override fun getItemCount(): Int = dataList.size
}