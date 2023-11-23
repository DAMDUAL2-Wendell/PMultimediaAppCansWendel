package com.omeudominio.cans.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.omeudominio.cans.R

data class Can(
    @DrawableRes val imageResourceId: Int,
    @StringRes val nome: Int,
    val edade: Int,
    @StringRes val hobbies: Int
)


