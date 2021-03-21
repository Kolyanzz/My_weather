package com.example.myweather.utils

import android.view.View

fun View.showSnackBar(
        text: String,
        actionText: String,
        action: (View) -> Unit,
        length: Int = com.google.android.material.snackbar.Snackbar.LENGTH_INDEFINITE
) {
    com.google.android.material.snackbar.Snackbar.make(this, text, length).setAction(actionText, action).show()
}