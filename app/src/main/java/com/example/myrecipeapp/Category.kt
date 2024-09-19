package com.example.myrecipeapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Category(
    val idCategory: String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription: String
): Parcelable

data class CategoriesResponse(
    val categories: List<Category>
)

//which I will use to get the data
//https://www.themealdb.com/api/json/v1/1/categories.php
