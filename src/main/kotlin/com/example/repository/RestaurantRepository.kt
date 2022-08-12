package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Restaurants

interface RestaurantRepository {
    val restaurant: Map<Int, List<Restaurants>>

    val page1: List<Restaurants>
    val page2: List<Restaurants>
    val page3: List<Restaurants>
    val page4: List<Restaurants>
    val page5: List<Restaurants>

    /**
     *  Get all the restaurant from database
     * */

    suspend fun getAllRestaurant(page: Int = 1): ApiResponse
}