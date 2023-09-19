package com.example.shoplist.domain

data class ShopItem (

    val name: String,
    val count:Int,
    val enabled: Boolean,
    var id: Int = UNDEFILED_ID){
    companion object{
        const val UNDEFILED_ID = -1
    }
}