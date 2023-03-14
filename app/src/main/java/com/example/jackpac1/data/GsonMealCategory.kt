package com.example.jackpac1.data

import com.example.jackpac1.service.MealCategory
import com.google.gson.annotations.SerializedName

data class GsonMealCategory(
    @SerializedName("idCategory") val idCategory: String,
    val strCategory: String,
    val strCategoryDescription: String,
    val strCategoryThumb: String
)

fun GsonMealCategory.asMealCategory(): MealCategory {
    return MealCategory (
        id = idCategory,
        name = strCategory,
        description = strCategoryDescription,
        imageUrl = strCategoryThumb,
    )
}