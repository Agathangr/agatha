package com.example.apicep.api

interface EnderecoAPI {
    @GET("ws/18130235/json/")
    suspend fun recuperarEndereco() : Response<Endereco>
}