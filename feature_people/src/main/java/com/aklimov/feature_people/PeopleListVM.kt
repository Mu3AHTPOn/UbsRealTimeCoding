package com.aklimov.feature_people

import com.aklimov.data.PeopleRepository
import com.aklimov.data.PeopleRepositoryImpl
import com.aklimov.data.entity.People
import io.reactivex.Single

class PeopleListVM {

    private val repo: PeopleRepository = PeopleRepositoryImpl()

    val getPeopleList: Single<List<People>> = repo.getPeoplesList()
}