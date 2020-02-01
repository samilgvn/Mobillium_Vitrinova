package com.example.vitrinova.RestAPI

open class BaseManager {

    val baseurl =BaseURL().bilgi_url
    protected  fun getRestApiClient(): RestApi {

        val restApiClient = RestApiClient(baseurl)

        return restApiClient.getmRestApi()


    }
}