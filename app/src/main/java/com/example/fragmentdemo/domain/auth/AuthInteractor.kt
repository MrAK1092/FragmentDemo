package com.example.fragmentdemo.domain.auth

interface AuthInteractor {

    fun auth(phone: String): Boolean
}