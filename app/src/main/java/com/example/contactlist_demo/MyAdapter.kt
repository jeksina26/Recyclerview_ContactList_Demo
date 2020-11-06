package com.example.contactlist_demo

import android.content.Context
import android.view.Display
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_contact.view.*
import java.util.*
import kotlin.collections.ArrayList

class MyAdapter(var contact : ArrayList<Model>, ctx: Context, var onContactClickListener: OnContactClickListener) : RecyclerView.Adapter<ViewHolder>(){

    var context = ctx
    var contactlist = ArrayList<Model>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_contact, parent, false)
        )
    }


    override fun getItemCount(): Int {
        return contact.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        var model = contact[position]

        holder.itemView.tvname.text = model.name
//        holder.itemView.tvnumber.text = model.number

        if (contact[position].image != null) {
            holder.image.setImageBitmap(contact[position].image)
        } else if (contact[position].name.startsWith("A")) {
            holder.image.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.a))
        } else if (contact[position].name.startsWith("B")) {
            holder.image.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.b))
        } else if (contact[position].name.startsWith("C")) {
            holder.image.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.c))
        } else if (contact[position].name.startsWith("D")) {
            holder.image.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.d))
        } else if (contact[position].name.startsWith("E")) {
            holder.image.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.e))
        } else if (contact[position].name.startsWith("F")) {
            holder.image.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.f))
        } else if (contact[position].name.startsWith("G")) {
            holder.image.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.g))
        } else if (contact[position].name.startsWith("H")) {
            holder.image.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.h))
        } else if (contact[position].name.startsWith("I")) {
            holder.image.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.i))
        } else if (contact[position].name.startsWith("J")) {
            holder.image.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.j))
        } else if (contact[position].name.startsWith("K")) {
            holder.image.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.k))
        } else if (contact[position].name.startsWith("L")) {
            holder.image.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.l))
        } else if (contact[position].name.startsWith("M")) {
            holder.image.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.m))
        } else if (contact[position].name.startsWith("N")) {
            holder.image.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.n))
        } else if (contact[position].name.startsWith("O")) {
            holder.image.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.o))
        } else if (contact[position].name.startsWith("P")) {
            holder.image.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.p))
        } else if (contact[position].name.startsWith("Q")) {
            holder.image.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.q))
        } else if (contact[position].name.startsWith("R")) {
            holder.image.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.r))
        } else if (contact[position].name.startsWith("S")) {
            holder.image.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.s))
        } else if (contact[position].name.startsWith("T")) {
            holder.image.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.t))
        } else if (contact[position].name.startsWith("U")) {
            holder.image.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.u))
        } else if (contact[position].name.startsWith("V")) {
            holder.image.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.v))
        } else if (contact[position].name.startsWith("W")) {
            holder.image.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.w))
        } else if (contact[position].name.startsWith("X")) {
            holder.image.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.x))
        } else if (contact[position].name.startsWith("Y")) {
            holder.image.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.y))
        } else if (contact[position].name.startsWith("Z")) {
            holder.image.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.z))
        } else {
            holder.image.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.mobile))
        }
        holder.itemView.setOnClickListener {
            onContactClickListener.OnIteamClock(position)
        }
    }

    fun updateList(list : MutableList<Model>){
        contact = list as ArrayList<Model>
        notifyDataSetChanged()
    }
}