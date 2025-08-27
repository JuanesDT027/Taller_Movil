package com.taller1compose.model

import kotlinx.serialization.Serializable

@Serializable
data class UserResponse(
    val users: List<User>
)

@Serializable
data class User(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val phone: String,
    val image: String
) {
    val fullName: String
        get() = "$firstName $lastName"
}
