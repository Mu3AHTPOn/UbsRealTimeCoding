package com.aklimov.feature_people

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aklimov.data.entity.People

class PeopleAdapter : RecyclerView.Adapter<PeopleViewHolder>() {

    var items: List<People> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeopleViewHolder {
        return PeopleViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_people, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: PeopleViewHolder, position: Int) {
        holder.bind(items[position])
    }
}