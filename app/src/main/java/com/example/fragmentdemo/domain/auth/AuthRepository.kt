package com.example.fragmentdemo.domain.auth

interface AuthRepository {

    fun auth(phone: String): Boolean
}