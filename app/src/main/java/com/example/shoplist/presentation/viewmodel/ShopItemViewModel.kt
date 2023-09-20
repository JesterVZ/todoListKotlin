package com.example.shoplist.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.example.shoplist.domain.ShopItem

class ShopItemViewModel : ViewModel() {
    lateinit var name: String
    lateinit var count: String
    fun addShopItem(){

    }
    fun  editShopItem(shopItem: ShopItem){
        name = shopItem.name
        count = shopItem.count.toString()
    }
    fun validate(){

    }
}