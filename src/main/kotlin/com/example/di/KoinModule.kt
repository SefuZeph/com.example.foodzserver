package com.example.di

import com.example.repository.RestaurantRepository
import com.example.repository.RestaurantRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<RestaurantRepository> {
        RestaurantRepositoryImpl()
    }
}