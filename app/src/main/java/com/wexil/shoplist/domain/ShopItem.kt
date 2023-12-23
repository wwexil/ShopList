package com.wexil.shoplist.domain

data class ShopItem(
    var id: Int,
    var name: String,
    var count: Int,
    val enabled: Boolean
)
