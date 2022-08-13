package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Restaurants

class RestaurantRepositoryImpl : RestaurantRepository {

    override val restaurant: Map<Int, List<Restaurants>> by lazy {
        mapOf(1 to page1, 2 to page2)
    }
    override val page1 = listOf(
        Restaurants(
            id = 1,
            name = "Inca Restaurant",
            location = "The Social House Nairobi",
            rating = 4.5,
            foodImage = "/images/inca.png"
        ), Restaurants(
            id = 2,
            name = "Fogo Gaucho",
            location = "Viking House, Waiyaki Way, Nairobi",
            rating = 4.6,
            foodImage = "/images/fogo.png"
        ),
        Restaurants(
            id = 3,
            name = "Mawimbi Seafood Restaurant & Cafè",
            location = "Longonot Place, Kijabe St, Nairobi",
            rating = 4.6,
            foodImage = "/images/mawimbi.png"
        )
    )

    override val page2 = listOf(
        Restaurants(
            id = 4,
            name = "Brew Bistro and Lounge",
            location = " Piedmont Plaza, 671 Ngong Rd, Nairobi City",
            rating = 4.4,
            foodImage = "/images/bistro.jpg"
        ), Restaurants(
            id = 5,
            name = "La Salumeria Restaurant",
            location = "Korosho Rd, Dhajay Apartments, ",
            rating = 4.4,
            foodImage = "/images/la.png"
        ),
        Restaurants(
            id = 6,
            name = "Ankole Grill Kilimani",
            location = "Galana Rd, Nairobi",
            rating = 4.5,
            foodImage = "/images/ankole.png"
        )
    )

    override suspend fun getAllRestaurant(page: Int): ApiResponse {
        TODO("Not yet implemented")
    }
}