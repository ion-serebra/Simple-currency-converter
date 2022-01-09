package com.noshaev.simplecurrencyconverter.di

import com.noshaev.simplecurrencyconverter.data.remote.CurrenciesRemoteStorage
import com.noshaev.simplecurrencyconverter.data.remote.CurrenciesRetrofitStorageImpl
import com.noshaev.simplecurrencyconverter.data.repository.CurrenciesRepository
import com.noshaev.simplecurrencyconverter.data.repository.CurrenciesRepositoryImpl
import com.noshaev.simplecurrencyconverter.domain.CurrenciesInteractor
import com.noshaev.simplecurrencyconverter.domain.CurrenciesInteractorImpl
import dagger.Binds
import dagger.Module

@Module
interface CurrenciesModule {

    @Binds
    fun bindCurrenciesRepo(
        currencyRepositoryImpl: CurrenciesRepositoryImpl
    ): CurrenciesRepository

    @Binds
    fun bindCurrenciesRemoteStorage(
        currencyRetrofitStorageImpl: CurrenciesRetrofitStorageImpl
    ): CurrenciesRemoteStorage

    @Binds
    fun bindCurrenciesInteractor(
        currencyInteractorImpl: CurrenciesInteractorImpl
    ): CurrenciesInteractor
}