package com.bugragoksu.retrofitkotlin.service

import com.bugragoksu.retrofitkotlin.model.CryptoModel
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET
//78f8d5332ea9ee2f375ad67d44bc0932
//https://api.nomics.com/v1/
//prices?key=78f8d5332ea9ee2f375ad67d44bc0932
interface CryptoAPI {

    @GET("prices?key=78f8d5332ea9ee2f375ad67d44bc0932")
    fun getData():Observable<List<CryptoModel>>

    //fun getData(): Call<List<CryptoModel>>
}