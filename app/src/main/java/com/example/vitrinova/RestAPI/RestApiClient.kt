package com.example.vitrinova.RestAPI

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RestApiClient {

    private lateinit var mRestApi: RestApi

    constructor(restApiServiceURL: String) {
        val builder = OkHttpClient.Builder()
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .connectTimeout(3, TimeUnit.SECONDS)


        val okHttpClient = builder.build()

        val retrofit = Retrofit.Builder()
            .baseUrl(restApiServiceURL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        mRestApi = retrofit.create(RestApi::class.java)
    }


    fun getmRestApi(): RestApi {

        return mRestApi


    }
}