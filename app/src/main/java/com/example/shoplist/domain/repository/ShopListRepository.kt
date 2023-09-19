package com.example.shoplist.domain.repository

import androidx.lifecycle.LiveData
import com.example.shoplist.domain.ShopItem

interface ShopListRepository {
    fun getShopList(): LiveData<List<ShopItem>>

    fun addShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemId: Int): ShopItem
}