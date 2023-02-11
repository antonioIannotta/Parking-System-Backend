package com.example.user.model.response

import com.example.user.model.UserInfo
import kotlinx.serialization.Serializable

@Serializable
data class UserInfoResponseBody(
    val foundInfo: Boolean,
    val message: String,
    val userInfo: UserInfo? = null
)
