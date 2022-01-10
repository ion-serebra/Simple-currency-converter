package com.noshaev.simplecurrencyconverter.data

import com.noshaev.simplecurrencyconverter.data.remote.CurrencyDto
import com.noshaev.simplecurrencyconverter.data.repository.CurrencyData

internal fun CurrencyDto.dtoToData(): CurrencyData =
    CurrencyData(
        id = id,
        numCode = numCode,
        charCode = charCode,
        nominal = nominal,
        name = name,
        value = value,
        previous = previous.toString()
    )

