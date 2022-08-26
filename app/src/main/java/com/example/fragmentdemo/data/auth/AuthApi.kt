package com.example.fragmentdemo.data.auth

interface AuthApi {

    fun auth(phone: String): Boolean
}