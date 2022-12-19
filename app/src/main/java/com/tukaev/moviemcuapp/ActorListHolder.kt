package com.tukaev.moviemcuapp

import android.provider.ContactsContract
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ActorListHolder(view: View): RecyclerView.ViewHolder(view) {
    private val actorPic: ImageView = itemView.findViewById(R.id.actorPic)
    private val actorName: TextView = itemView.findViewById(R.id.actorName)

    fun bind(actor: Actor) {
        actorName.text = actor.name
        actorPic.setImageResource(actor.photo)
    }
}