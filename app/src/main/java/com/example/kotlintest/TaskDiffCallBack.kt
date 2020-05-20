package com.example.kotlintest

import androidx.recyclerview.widget.DiffUtil

class TaskDiffCallBack : DiffUtil.ItemCallback<Student>() {
    override fun areItemsTheSame(oldItem: Student, newItem: Student): Boolean {
        return oldItem?.Hoten.equals(newItem?.Hoten)
    }

    override fun areContentsTheSame(oldItem: Student, newItem: Student): Boolean {
        return oldItem.equals(newItem)
    }
}