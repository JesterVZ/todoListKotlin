package com.example.shoplist.domain.usecase

import com.example.shoplist.domain.ShopItem
import com.example.shoplist.domain.repository.ShopListRepository

class AddShopItemUseCase(private val repository: ShopListRepository) {
    fun addShopList(shopItem: ShopItem){
        repository.addShopItem(shopItem)
    }
}