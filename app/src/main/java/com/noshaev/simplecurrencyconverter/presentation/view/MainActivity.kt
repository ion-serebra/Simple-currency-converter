package com.noshaev.simplecurrencyconverter.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.noshaev.simplecurrencyconverter.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, CurrenciesListFragment.newInstance())
                .commitNow()
        }
    }
}