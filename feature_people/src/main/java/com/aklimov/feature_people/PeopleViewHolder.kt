package com.aklimov.feature_people

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aklimov.data.entity.People

class PeopleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(people: People) {
        itemView.findViewById<TextView>(R.id.tvItemPeopleName).text = people.name
        itemView.findViewById<TextView>(R.id.tvItemPeopleGender).text = people.gender
    }
}