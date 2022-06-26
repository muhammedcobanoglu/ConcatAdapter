package com.muhammed.concatadapter.ui.home.header

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muhammed.concatadapter.data.Fruit
import com.muhammed.concatadapter.databinding.ItemHeaderBinding

/**
 * Created by Muhammed COBANOGLU on 25.06.2022.
 */
class HeaderItemAdapter(dataList: List<Fruit>, private val onClick: (Fruit) -> Unit) :
    RecyclerView.Adapter<HeaderItemAdapter.ViewHolder>() {
    private var dataList: List<Fruit> = arrayListOf()

    init {
        this.dataList = dataList
    }

    class ViewHolder(private val binding: ItemHeaderBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(fruit: Fruit, onClick: (Fruit) -> Unit) {
            binding.fruit = fruit
            binding.root.setOnClickListener { onClick(fruit) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemHeaderBinding.inflate(layoutInflater, parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataList[position], onClick)
    }

    override fun getItemCount(): Int = dataList.size
}