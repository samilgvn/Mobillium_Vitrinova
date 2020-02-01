package com.example.vitrinova.RestAPI



import com.example.vitrinova.Models.Allitem
import com.example.vitrinova.Models.Featured.Featured
import retrofit2.Call

class ManagerAll : BaseManager() {

    fun getirBilgileri():Call<List<Allitem>> {
        val call = getRestApiClient().bilgigetir()
        return call
    }
    companion object {
        @get:Synchronized val instance = ManagerAll()
    }

}