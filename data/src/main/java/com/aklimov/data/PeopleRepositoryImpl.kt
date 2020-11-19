package com.aklimov.data

import com.aklimov.data.entity.People
import com.aklimov.data.retrofit.SwapiRemoteApi
import io.reactivex.Scheduler
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class PeopleRepositoryImpl : PeopleRepository {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://swapi.dev/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
        .build()

    private val api = retrofit.create(SwapiRemoteApi::class.java)

    override fun getPeoplesList(): Single<List<People>> = api.getPeople()
}