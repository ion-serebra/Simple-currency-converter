package com.noshaev.simplecurrencyconverter.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.noshaev.simplecurrencyconverter.domain.CurrenciesInteractor
import javax.inject.Inject

class CurrencyViewModel
@Inject constructor(
    private val currenciesInteractor: CurrenciesInteractor
) : ViewModel() {
    // TODO: Implement the ViewModel
}