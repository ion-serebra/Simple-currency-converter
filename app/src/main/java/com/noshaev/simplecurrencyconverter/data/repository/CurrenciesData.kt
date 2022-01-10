package com.noshaev.simplecurrencyconverter.data.repository

class CurrencyData(
    val id: String,
    val numCode: String,
    val charCode: String,
    val nominal: Int,
    val name: String,
    val value: Double,
    val previous: String,
)