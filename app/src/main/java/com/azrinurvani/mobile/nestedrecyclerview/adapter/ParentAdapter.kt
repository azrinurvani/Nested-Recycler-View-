package com.azrinurvani.mobile.nestedrecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.azrinurvani.mobile.nestedrecyclerview.databinding.ParentItemBinding
import com.azrinurvani.mobile.nestedrecyclerview.model.ParentItem

class ParentAdapter(private val parentList : List<ParentItem>) : RecyclerView.Adapter<ParentAdapter.ParentViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParentViewHolder {
        return ParentViewHolder(ParentItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ))
    }

    override fun getItemCount() = parentList.size


    override fun onBindViewHolder(holder: ParentViewHolder, position: Int) {
        val parentItem = parentList[position]
        parentItem.logo?.let { holder.binding.imgParentLogo.setImageResource(it) }
        holder.binding.tvParentTitle.text = parentItem.title

        holder.binding.rvChild.setHasFixedSize(true)
        holder.binding.rvChild.layoutManager = GridLayoutManager(holder.itemView.context,3)
        val adapter = ChildAdapter(parentItem.mList)
        holder.binding.rvChild.adapter = adapter
    }

    inner class ParentViewHolder(val binding: ParentItemBinding) : RecyclerView.ViewHolder(binding.root){

    }
}