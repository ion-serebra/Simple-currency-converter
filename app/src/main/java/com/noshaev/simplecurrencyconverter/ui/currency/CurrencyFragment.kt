package com.noshaev.simplecurrencyconverter.ui.currency

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.noshaev.simplecurrencyconverter.R

class CurrencyFragment : Fragment() {

    companion object {
        fun newInstance() = CurrencyFragment()
    }

    private lateinit var viewModel: CurrencyViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.currency_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CurrencyViewModel::class.java)
        // TODO: Use the ViewModel
    }

}