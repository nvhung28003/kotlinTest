package com.example.kotlintest

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlintest.iInterface.BaseInterfaceAdapter

class DataBindingViewHolder <T>(private val binding: ViewDataBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(item: T,listener : BaseInterfaceAdapter) {
        binding.setVariable(BR.item,item)
        binding.setVariable(BR.clickListener,listener)
        binding.executePendingBindings()
    }
}