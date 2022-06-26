package com.muhammed.concatadapter.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.muhammed.concatadapter.databinding.FragmentDetailBinding

/**
 * Created by Muhammed COBANOGLU on 25.06.2022.
 */

class DetailFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentDetailBinding
    private val args by navArgs<DetailFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailBinding.inflate(inflater, container, false)

        setupData()

        return binding.root
    }

    private fun setupData() {
        binding.fruit = args.fruit
    }
}