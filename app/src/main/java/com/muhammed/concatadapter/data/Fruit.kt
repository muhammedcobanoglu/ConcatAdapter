package com.muhammed.concatadapter.data

import android.os.Parcel
import android.os.Parcelable
import androidx.annotation.DrawableRes

/**
 * Created by Muhammed COBANOGLU on 25.06.2022.
 */

data class Fruit(
    @DrawableRes
    val fruitImage: Int,
    val fruitName: String
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString().toString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(fruitImage)
        parcel.writeString(fruitName)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Fruit> {
        override fun createFromParcel(parcel: Parcel): Fruit {
            return Fruit(parcel)
        }

        override fun newArray(size: Int): Array<Fruit?> {
            return arrayOfNulls(size)
        }
    }
}