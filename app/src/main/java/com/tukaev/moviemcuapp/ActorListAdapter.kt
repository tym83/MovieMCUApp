package com.tukaev.moviemcuapp

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ActorListAdapter(
    var actors: List<Actor>
): RecyclerView.Adapter<ActorListHolder>() {

    override fun getItemCount(): Int = actors.size

    private fun getItem(position: Int): Actor = actors[position]

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorListHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_holder_actor, parent, false)

        return ActorListHolder(view)
    }

    override fun onBindViewHolder(holder: ActorListHolder, position: Int) {
        holder.bind(getItem(position))
    }
}