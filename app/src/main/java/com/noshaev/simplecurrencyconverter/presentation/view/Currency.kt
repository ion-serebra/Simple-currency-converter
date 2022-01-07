package com.noshaev.simplecurrencyconverter.presentation.view

/**
 * This class describes data prepared for display in a user interface element
 */
class Currency(
    val id: String, // TODO will be used in future updates with diff utils
    val name: String,
    val value: String,
    val nominal: String,
    val previousValue: String,
)