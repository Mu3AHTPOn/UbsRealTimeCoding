package com.aklimov.feature_people

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PeopleListFragment : Fragment() {

    companion object {
        // TODO add some args if needed
        fun newInstance(): PeopleListFragment {
            return PeopleListFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_people, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var rvPeople = view as RecyclerView
        rvPeople.layoutManager = LinearLayoutManager()
    }

    override fun onStart() {
        super.onStart()
        // TODO subscribe to VM to show people
    }

    override fun onStop() {
        super.onStop()
        // TOOD dispose
    }
}