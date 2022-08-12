package com.example.models

@kotlinx.serialization.Serializable
data class Restaurants(
    val id: Int,
    val name: String,
    val location: String,
    val rating: Double,
    val foodImage: String
)