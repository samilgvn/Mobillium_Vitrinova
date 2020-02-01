package com.example.vitrinova.RestAPI



import com.example.vitrinova.Models.Allitem
import com.example.vitrinova.Models.Featured.Featured
import retrofit2.Call
import retrofit2.http.GET

interface RestApi {

    @GET("/api/v2/discover")
     fun bilgigetir(): Call<List<Allitem>>


}