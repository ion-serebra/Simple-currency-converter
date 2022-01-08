package com.noshaev.simplecurrencyconverter.domain

import com.noshaev.simplecurrencyconverter.data.repository.CurrenciesRepository
import javax.inject.Inject

class CurrenciesInteractor @Inject constructor(
    private val currenciesRepository: CurrenciesRepository
) {
}