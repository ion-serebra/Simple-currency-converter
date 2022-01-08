package com.noshaev.simplecurrencyconverter.di.currency

import com.noshaev.simplecurrencyconverter.presentation.view.CurrenciesListFragment
import dagger.Module
import dagger.Provides

@Module
object CurrenciesScreenModule {

    @Provides
    fun provideCurrenciesListFragment(): CurrenciesListFragment =
        CurrenciesListFragment.newInstance()
}