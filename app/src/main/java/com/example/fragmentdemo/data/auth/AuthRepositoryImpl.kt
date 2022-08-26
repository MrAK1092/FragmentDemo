package com.example.fragmentdemo.data.auth

import com.example.fragmentdemo.domain.auth.AuthRepository
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val authApi: AuthApi
) : AuthRepository {

    override fun auth(phone: String): Boolean {
        return authApi.auth(phone)
    }
}