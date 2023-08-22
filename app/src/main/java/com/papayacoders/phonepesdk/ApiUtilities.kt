package com.papayacoders.phonepe

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiUtilities {


    fun getApiInterface(): ApiInterface {
        return Retrofit.Builder()
            .baseUrl("https://api-preprod.phonepe.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiInterface::class.java)
    }


}