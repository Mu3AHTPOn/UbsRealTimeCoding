package com.aklimov.data.retrofit

import com.aklimov.data.entity.People
import com.aklimov.data.entity.PeoplesResponse
import io.reactivex.Single
import retrofit2.http.GET

interface SwapiRemoteApi {

    @GET("people")
    fun getPeople(): Single<PeoplesResponse>
}