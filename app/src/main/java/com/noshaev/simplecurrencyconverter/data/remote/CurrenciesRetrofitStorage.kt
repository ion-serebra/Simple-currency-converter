package com.noshaev.simplecurrencyconverter.data.remote

import javax.inject.Inject

class CurrenciesRetrofitStorage
@Inject constructor(
    private val api: CentralBankRussiaPublicApi
) {
}