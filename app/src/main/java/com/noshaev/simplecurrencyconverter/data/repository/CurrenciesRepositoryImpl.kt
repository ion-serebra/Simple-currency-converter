package com.noshaev.simplecurrencyconverter.data.repository

import com.noshaev.simplecurrencyconverter.data.remote.CurrenciesRemoteStorage
import javax.inject.Inject

class CurrenciesRepositoryImpl
@Inject constructor(
    private val currenciesRetrofitStorage: CurrenciesRemoteStorage
): CurrenciesRepository {
}