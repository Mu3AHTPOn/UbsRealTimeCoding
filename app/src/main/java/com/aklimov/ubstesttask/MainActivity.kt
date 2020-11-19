package com.aklimov.ubstesttask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aklimov.feature_people.PeopleListFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.flRootFragmentContainer, PeopleListFragment.newInstance())
                .commit()
        }
    }
}