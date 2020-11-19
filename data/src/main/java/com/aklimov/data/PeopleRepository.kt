package com.aklimov.data

import com.aklimov.data.entity.People
import io.reactivex.Single

interface PeopleRepository {

    fun getPeoplesList(): Single<List<People>>
}