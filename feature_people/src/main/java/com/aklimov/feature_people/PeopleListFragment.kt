package com.aklimov.feature_people

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.disposables.Disposables

private const val LOG_TAG = "PeopleListFragment"

class PeopleListFragment : Fragment() {

    companion object {
        // TODO add some args if needed
        fun newInstance(): PeopleListFragment {
            return PeopleListFragment()
        }
    }

    private val viewModel: IPeopleListViewModel = PeopleListViewModelImpl()
    private val adapter: PeopleAdapter = PeopleAdapter()

    private var disposable: Disposable = Disposables.disposed()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_people, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rvPeople = view as RecyclerView
        rvPeople.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        rvPeople.adapter = adapter
    }

    override fun onStart() {
        super.onStart()
        disposable = viewModel
            .getPeopleList
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {
                    adapter.items = it
                },
                {
                    Log.e(LOG_TAG, "Error during get list of people", it)
                }
            )
    }

    override fun onStop() {
        super.onStop()
        disposable.dispose()
    }
}