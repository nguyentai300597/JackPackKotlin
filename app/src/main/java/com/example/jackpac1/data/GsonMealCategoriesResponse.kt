package com.example.jackpac1.data

import com.example.jackpac1.service.MealCategory

data class GsonMealCategoriesResponse (
    val categories: List<GsonMealCategory>
)

fun GsonMealCategoriesResponse.asMealCategories(): List<MealCategory> {
    return categories.map {
        it.asMealCategory()
    }
}