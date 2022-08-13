package com.example.routes

import com.example.models.ApiResponse
import com.example.repository.RestaurantRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.getAllRestaurant() {
    val restaurantRepository: RestaurantRepository by inject()

    get("/restaurant") {
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            require(page in 1..2)
            val apiRepository = restaurantRepository.getAllRestaurant(page)
            call.respond(message = apiRepository, status = HttpStatusCode.OK)
        } catch (e: NumberFormatException) {
            call.respond(
                message = ApiResponse(success = false, message = "Only Numbers Allowed"),
                status = HttpStatusCode.BadRequest
            )
        } catch (e: IllegalArgumentException) {
            call.respond(
                message = ApiResponse(success = false, message = "Restaurant not Found."),
                status = HttpStatusCode.NotFound
            )
        }
    }
}