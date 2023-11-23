package com.omeudominio.cans.data

import com.omeudominio.cans.R
import com.omeudominio.cans.model.Can

object CanRepositorio{
    val cans = listOf<Can>(
        Can(R.drawable.koda, R.string.dog_name_1, 2, R.string.dog_description_1),
        Can(R.drawable.lola, R.string.dog_name_2, 16, R.string.dog_description_2),
        Can(R.drawable.frankie, R.string.dog_name_3, 2, R.string.dog_description_3),
        Can(R.drawable.nox, R.string.dog_name_4, 8, R.string.dog_description_4),
        Can(R.drawable.faye, R.string.dog_name_5, 8, R.string.dog_description_5),
        Can(R.drawable.bella, R.string.dog_name_6, 14, R.string.dog_description_6),
        Can(R.drawable.moana, R.string.dog_name_7, 2, R.string.dog_description_7),
        Can(R.drawable.tzeitel, R.string.dog_name_8, 7, R.string.dog_description_8),
        Can(R.drawable.leroy, R.string.dog_name_9, 4, R.string.dog_description_9)
    )
}