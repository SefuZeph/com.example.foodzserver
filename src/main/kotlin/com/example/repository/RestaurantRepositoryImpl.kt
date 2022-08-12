package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Restaurants

class RestaurantRepositoryImpl(
    override val restaurant: Map<Int, List<Restaurants>>,
    override val page1: List<Restaurants>,
    override val page2: List<Restaurants>,
    override val page3: List<Restaurants>,
    override val page4: List<Restaurants>,
    override val page5: List<Restaurants>
) : RestaurantRepository {
    override suspend fun getAllRestaurant(page: Int): ApiResponse {
        TODO("Not yet implemented")
    }
}