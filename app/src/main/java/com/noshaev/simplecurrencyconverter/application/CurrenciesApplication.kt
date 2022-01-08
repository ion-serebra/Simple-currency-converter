package com.noshaev.simplecurrencyconverter.application

import android.app.Application
import com.noshaev.simplecurrencyconverter.di.DaggerAppComponent

class CurrenciesApplication : Application() {
    val appComponent = DaggerAppComponent.create()
}