package com.noshaev.simplecurrencyconverter.di

import com.noshaev.simplecurrencyconverter.application.CurrenciesApplication
import com.noshaev.simplecurrencyconverter.di.currency.CurrenciesScreenModule
import com.noshaev.simplecurrencyconverter.di.network.NetworkModule
import com.noshaev.simplecurrencyconverter.presentation.view.CurrenciesListFragment
import com.noshaev.simplecurrencyconverter.presentation.view.MainActivity
import dagger.Component
import dagger.android.AndroidInjector

@Component(
    modules = [
        CurrenciesScreenModule::class,
        NetworkModule::class,
    ]
)
interface AppComponent: AndroidInjector<CurrenciesApplication> {
    fun inject(activity: MainActivity)
    fun inject(currenciesListFragment: CurrenciesListFragment)
}