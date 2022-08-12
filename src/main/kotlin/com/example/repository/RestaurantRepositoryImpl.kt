package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Restaurants

class RestaurantRepositoryImpl : RestaurantRepository {

    override val restaurant: Map<Int, List<Restaurants>>
        get() = TODO()
    override val page1: List<Restaurants>
        get() = TODO()
    override val page2: List<Restaurants>
        get() = TODO()
    override val page3: List<Restaurants>
        get() = TODO()
    override val page4: List<Restaurants>
        get() = TODO()
    override val page5: List<Restaurants>
        get() = TODO()

    override suspend fun getAllRestaurant(page: Int): ApiResponse {
        TODO("Not yet implemented")
    }
}