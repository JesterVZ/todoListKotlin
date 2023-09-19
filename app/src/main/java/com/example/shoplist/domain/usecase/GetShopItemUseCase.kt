package com.example.shoplist.domain.usecase

import com.example.shoplist.domain.ShopItem
import com.example.shoplist.domain.repository.ShopListRepository

class GetShopItemUseCase(private val repository: ShopListRepository) {
    fun getShopItem(shopItemId: Int): ShopItem{
        return repository.getShopItem(shopItemId);
    }
}