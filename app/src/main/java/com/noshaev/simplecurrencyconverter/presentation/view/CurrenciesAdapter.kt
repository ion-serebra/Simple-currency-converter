package com.noshaev.simplecurrencyconverter.presentation.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.noshaev.simplecurrencyconverter.databinding.ViewCurrencyBinding

class CurrenciesAdapter : RecyclerView.Adapter<CurrenciesAdapter.CurrencyViewHolder>() {

    private val currencies: MutableList<Currency> = mutableListOf()

    inner class CurrencyViewHolder(binding: ViewCurrencyBinding) :
        RecyclerView.ViewHolder(binding.root) {

        val binding = ViewCurrencyBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrencyViewHolder {
        val binding =
            ViewCurrencyBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CurrencyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CurrencyViewHolder, position: Int) {
        val currency = currencies[position]
        with(holder) {
            binding.currencyName.text = currency.name
            binding.currencyNominal.text = currency.nominal
            binding.currencyValue.text = currency.value
            binding.currencyPreviousValue.text = currency.previousValue
        }
    }

    override fun getItemCount(): Int {
        return currencies.size
    }

    fun setList(list: List<Currency>) {
        currencies.clear()
        currencies.addAll(list)
    }
}