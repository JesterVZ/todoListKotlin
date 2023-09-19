package com.example.shoplist.domain.usecase

import com.example.shoplist.domain.ShopItem
import com.example.shoplist.domain.repository.ShopListRepository

class DeleteShopItemUseCase(private val repository: ShopListRepository) {
    fun deleteShopItem(shopItem: ShopItem){
        repository.deleteShopItem(shopItem);
    }
}