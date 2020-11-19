package com.aklimov.feature_people

import com.aklimov.data.entity.People
import io.reactivex.Single

interface IPeopleListViewModel {
    val getPeopleList: Single<List<People>>
}