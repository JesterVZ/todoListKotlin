package com.example.shoplist.domain.usecase

import com.example.shoplist.domain.ShopItem
import com.example.shoplist.domain.repository.ShopListRepository

class EditShopItemUseCase(private val repository: ShopListRepository) {
    fun editShopItem(shopItem: ShopItem){
        repository.editShopItem(shopItem)
    }
}