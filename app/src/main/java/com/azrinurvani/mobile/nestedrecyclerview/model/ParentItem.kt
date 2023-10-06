package com.azrinurvani.mobile.nestedrecyclerview.model

data class ParentItem(
    val title: String? = null,
    val logo : Int? = null,
    val mList : List<ChildItem>
)