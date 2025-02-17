package com.example.ktorchatapp.data.remote

import com.example.ktorchatapp.domain.model.Message

interface MessageService {
    suspend fun getAllMessages(): List<Message>

    companion object {
        const val BASE_URL = "https://a1f5-103-93-36-152.ngrok-free.app"
    }

    sealed class Endpoints(val url: String){
        object GetAllMessages: Endpoints("$BASE_URL/messages ")
    }
}