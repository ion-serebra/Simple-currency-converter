package com.noshaev.simplecurrencyconverter.presentation.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.noshaev.simplecurrencyconverter.R
import com.noshaev.simplecurrencyconverter.databinding.ScreenCurrenciesListBinding
import com.noshaev.simplecurrencyconverter.presentation.viewmodel.CurrencyViewModel

class CurrenciesListFragment : Fragment(R.layout.screen_currencies_list) {

    companion object {
        fun newInstance() = CurrenciesListFragment()
    }

    private lateinit var viewModel: CurrencyViewModel
    private val binding: ScreenCurrenciesListBinding by viewBinding()
    private val adapter = CurrenciesAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        with(binding) {
            currenciesListRecycler.layoutManager =
                LinearLayoutManager(context).apply {
                    orientation = LinearLayoutManager.VERTICAL
                }
            currenciesListRecycler.adapter = adapter
        }

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CurrencyViewModel::class.java)
        // TODO: Use the ViewModel
    }
}