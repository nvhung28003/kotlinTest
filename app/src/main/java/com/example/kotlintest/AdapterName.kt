package com.example.kotlintest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.DiffUtil


import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlintest.databindingadapter.DataBindingAdapter
import kotlinx.android.synthetic.main.item.view.*

class AdapterName : DataBindingAdapter<Student>(DiffCallBack()) {
    override fun getItemViewType(position: Int): Int {
        return R.layout.item
    }
    private class DiffCallBack : DiffUtil.ItemCallback<Student>() {
        override fun areItemsTheSame(oldItem: Student, newItem: Student): Boolean {

            return oldItem?.Hoten.equals(newItem?.Hoten)
        }

        override fun areContentsTheSame(oldItem: Student, newItem: Student): Boolean {
            return oldItem?.Hoten.equals(newItem?.Hoten)
        }
    }
}