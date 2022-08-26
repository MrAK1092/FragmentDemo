package com.example.fragmentdemo.domain.auth

import javax.inject.Inject

class AuthInteractorImpl @Inject constructor(
    private val authRepository: AuthRepository
) : AuthInteractor {

    override fun auth(phone: String): Boolean {
        return authRepository.auth(phone)
    }
}