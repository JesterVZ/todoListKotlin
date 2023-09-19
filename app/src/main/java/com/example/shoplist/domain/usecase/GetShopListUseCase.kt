package com.example.shoplist.domain.usecase

import androidx.lifecycle.LiveData
import com.example.shoplist.domain.ShopItem
import com.example.shoplist.domain.repository.ShopListRepository

class GetShopListUseCase(private val repository: ShopListRepository) {
    fun getShopList():LiveData<List<ShopItem>>{
        return repository.getShopList();
    }
}