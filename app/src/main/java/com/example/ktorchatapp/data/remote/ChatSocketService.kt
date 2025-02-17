package com.example.ktorchatapp.data.remote

import com.example.ktorchatapp.domain.model.Message
import com.example.ktorchatapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface ChatSocketService {

    suspend fun initSession(
        username: String
    ): Resource<Unit>

    suspend fun sendMessage(message: String)

    fun observeMessages(): Flow<Message>

    suspend fun closeSession()

    companion object {
        const val BASE_URL = "https://a1f5-103-93-36-152.ngrok-free.app"
    }

    sealed class Endpoints(val url: String){
        object ChatSocket: Endpoints("$BASE_URL/chat-socket ")
    }
}