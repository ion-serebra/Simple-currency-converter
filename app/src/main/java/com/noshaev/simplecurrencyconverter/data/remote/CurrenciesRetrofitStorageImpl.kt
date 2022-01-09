package com.noshaev.simplecurrencyconverter.data.remote

import javax.inject.Inject

class CurrenciesRetrofitStorageImpl
@Inject constructor(
    private val api: CentralBankRussiaPublicApi
): CurrenciesRemoteStorage {
}