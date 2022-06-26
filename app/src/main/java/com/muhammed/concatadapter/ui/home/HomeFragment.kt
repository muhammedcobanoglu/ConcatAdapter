package com.muhammed.concatadapter.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.muhammed.concatadapter.R
import com.muhammed.concatadapter.data.Fruit
import com.muhammed.concatadapter.data.fruitList
import com.muhammed.concatadapter.databinding.FragmentHomeBinding
import com.muhammed.concatadapter.ui.home.header.HeaderAdapter
import com.muhammed.concatadapter.ui.home.header.HeaderItemAdapter
import com.muhammed.concatadapter.util.goToDestination

/**
 * Created by Muhammed COBANOGLU on 25.06.2022.
 */
class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private var TAG = "HomeFragment"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        setupUI()

        return binding.root
    }

    private fun setupUI() {
        val fruitList = fruitList(this.resources)
        val headerItemAdapter = HeaderItemAdapter(fruitList, onClick = { onHeaderItemClicked(it) })
        val headerAdapter = HeaderAdapter(headerItemAdapter)
        val bodyAdapter = BodyAdapter(fruitList)
        val footerAdapter = FooterAdapter()

        val concatAdapter = ConcatAdapter(footerAdapter, bodyAdapter, headerAdapter)
        val layoutManager = LinearLayoutManager(activity)
        binding.mainList.layoutManager = layoutManager
        binding.mainList.addItemDecoration(
            DividerItemDecoration(
                binding.mainList.context,
                (binding.mainList.layoutManager as LinearLayoutManager).orientation
            )
        )
        binding.mainList.adapter = concatAdapter
    }

    private fun onHeaderItemClicked(fruit: Fruit) {
        val bundle = bundleOf("fruit" to fruit)
        activity.goToDestination(TAG, bundle, R.id.action_homeFragment_to_detailFragment)
    }
}