package com.noshaev.simplecurrencyconverter.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.noshaev.simplecurrencyconverter.R
import com.noshaev.simplecurrencyconverter.ui.currency.CurrencyFragment

class CurrencyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.currency_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, CurrencyFragment.newInstance())
                .commitNow()
        }
    }
}