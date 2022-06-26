package com.muhammed.concatadapter.util

import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.BindingAdapter
import androidx.navigation.findNavController
import com.muhammed.concatadapter.data.Fruit
import com.muhammed.concatadapter.ui.home.HomeFragmentDirections

/**
 * Created by Muhammed COBANOGLU on 25.06.2022.
 */
class BindingAdapters {

    companion object {
        @BindingAdapter("android:imgRes")
        @JvmStatic
        fun setImageResource(imageView: ImageView, resource: Int) {
            imageView.setImageResource(resource)
        }

        @BindingAdapter("android:sendFruitInfo")
        @JvmStatic
        fun startAction(view: ConstraintLayout, fruit: Fruit) {
            view.setOnClickListener {
                val action = HomeFragmentDirections.actionHomeFragmentToDetailFragment(fruit)
                view.findNavController().navigate(action)
            }
        }
    }
}