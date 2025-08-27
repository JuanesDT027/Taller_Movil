package com.taller1compose.network

import com.taller1compose.model.UserResponse
import io.ktor.client.call.body
import io.ktor.client.request.get

object UserApiService {
    private const val BASE_URL = "https://dummyjson.com"

    suspend fun getUsers(): UserResponse {
        return ApiClient.client.get("$BASE_URL/users").body()
    }
}
