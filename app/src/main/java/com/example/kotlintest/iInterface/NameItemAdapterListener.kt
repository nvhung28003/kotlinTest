package com.example.kotlintest.iInterface

import com.example.kotlintest.Student

interface NameItemAdapterListener : BaseInterfaceAdapter {
    fun onClickItem(item : Student)
}