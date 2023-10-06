package com.azrinurvani.mobile.nestedrecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.azrinurvani.mobile.nestedrecyclerview.databinding.ChildItemBinding
import com.azrinurvani.mobile.nestedrecyclerview.model.ChildItem

class ChildAdapter(private val childList : List<ChildItem>) : RecyclerView.Adapter<ChildAdapter.ChildViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildViewHolder {
        return ChildViewHolder(
            ChildItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,false
            )
        )
    }

    override fun getItemCount() = childList.size

    override fun onBindViewHolder(holder: ChildViewHolder, position: Int) {
        val childItem = childList[position]

        holder.binding.tvChildTitle.text = childItem.title
        childItem.logo?.let { holder.binding.imgChildLogo.setImageResource(it) }
    }

    inner class ChildViewHolder(val binding : ChildItemBinding): RecyclerView.ViewHolder(binding.root) {

    }
}