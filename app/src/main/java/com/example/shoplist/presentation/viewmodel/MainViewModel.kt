package com.example.shoplist.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoplist.data.repository.ShopListRepositoryImpl
import com.example.shoplist.domain.ShopItem
import com.example.shoplist.domain.usecase.DeleteShopItemUseCase
import com.example.shoplist.domain.usecase.EditShopItemUseCase
import com.example.shoplist.domain.usecase.GetShopListUseCase

class MainViewModel : ViewModel() {
    private val repository = ShopListRepositoryImpl()
    private val getShopListUseCase = GetShopListUseCase(repository)
    private val editShopListUseCase = EditShopItemUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()


    fun deleteShopItem(shopItem: ShopItem){
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun editShopList(shopItem: ShopItem){
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopListUseCase.editShopItem(newItem)
    }

}