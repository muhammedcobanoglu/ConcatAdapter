package com.muhammed.concatadapter.util

import android.app.Activity
import android.os.Bundle
import android.util.Log
import androidx.navigation.Navigation.findNavController
import com.muhammed.concatadapter.R

private const val idRes: Int = R.id.fragmentContainerView

fun Activity?.goToDestination(TAG: String, bundle: Bundle, destinationId: Int) {
    if (this == null) {
        Log.e(TAG, "activity is null")
        return
    }
    try {
        findNavController(this, idRes).navigate(destinationId, bundle)
    } catch (exception: IllegalStateException) {
        Log.e(TAG, "does not have a NavController")
    } catch (exception: IllegalArgumentException) {
        Log.e(TAG, "destination is unknown to this navGraph")
    }
}