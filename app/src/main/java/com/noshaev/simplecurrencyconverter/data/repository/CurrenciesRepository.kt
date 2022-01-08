package com.noshaev.simplecurrencyconverter.data.repository

import com.noshaev.simplecurrencyconverter.data.remote.CurrenciesRetrofitStorage
import javax.inject.Inject

class CurrenciesRepository
@Inject constructor(
    private val currenciesRetrofitStorage: CurrenciesRetrofitStorage
) {
}