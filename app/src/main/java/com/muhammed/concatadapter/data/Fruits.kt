package com.muhammed.concatadapter.data

import android.content.res.Resources
import com.muhammed.concatadapter.R

/**
 * Created by Muhammed COBANOGLU on 25.06.2022.
 */

/* Returns initial list of fruits. */
fun fruitList(resources: Resources): List<Fruit> {
    return listOf(
        Fruit(
            fruitImage = R.drawable.ic_apricot,
            fruitName = resources.getString(R.string.apricot)
        ),
        Fruit(
            fruitImage = R.drawable.ic_apple,
            fruitName = resources.getString(R.string.apple)
        ),
        Fruit(
            fruitImage = R.drawable.ic_avocado,
            fruitName = resources.getString(R.string.avocado)
        ),
        Fruit(
            fruitImage = R.drawable.ic_cherry,
            fruitName = resources.getString(R.string.cherry)
        ),
        Fruit(
            fruitImage = R.drawable.ic_grapes,
            fruitName = resources.getString(R.string.grapes)
        ),
        Fruit(
            fruitImage = R.drawable.ic_blueberry,
            fruitName = resources.getString(R.string.blueberry)
        ),
        Fruit(
            fruitImage = R.drawable.ic_lemon,
            fruitName = resources.getString(R.string.lemon)
        )/*,
        Fruit(
            fruitImage = R.drawable.ic_watermelon,
            fruitName = resources.getString(R.string.watermelon)
        ),
        Fruit(
            fruitImage = R.drawable.ic_strawberry,
            fruitName = resources.getString(R.string.strawberry)
        ),
        Fruit(
            fruitImage = R.drawable.ic_pear,
            fruitName = resources.getString(R.string.pear)
        )*/
    )
}