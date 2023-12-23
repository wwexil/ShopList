package com.wexil.shoplist.domain

interface ShopListRepository {

    fun getShopList(): List<ShopItem>

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItemById(shopItemId: Int): ShopItem


}