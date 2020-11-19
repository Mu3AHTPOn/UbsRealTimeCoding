package com.aklimov.feature_people

import com.aklimov.data.PeopleRepository
import com.aklimov.data.PeopleRepositoryImpl
import com.aklimov.data.entity.People
import io.reactivex.Single

class PeopleListViewModelImpl : IPeopleListViewModel {

    private val repo: PeopleRepository = PeopleRepositoryImpl()

    override val getPeopleList: Single<List<People>> = repo.getPeoplesList()
}