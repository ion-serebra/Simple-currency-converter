package com.noshaev.simplecurrencyconverter.data.remote

import com.google.gson.annotations.SerializedName

/** Class describes a request to the api of the central bank of Russia
 *
 * @property date Date of last update. Example: ("2022-01-11T11:30:00+03:00")
 * @property previousDate Date of previous update
 * @property previousUrl URL of previous exchange rates. Example: ("\/\/www.cbr-xml-daily.ru\/archive\/2021\/12\/31\/daily_json.js")
 * @property timestamp time of the last update. Example: ("2022-01-10T18:00:00+03:00")
 * @property valute List of exchange rates against the ruble
 */
class CurrenciesDto(
    @SerializedName("date")
    val date: String,
    @SerializedName("previousDate")
    val previousDate: String,
    @SerializedName("previousUrl")
    val previousUrl: String,
    @SerializedName("timestamp")
    val timestamp: String,
    @SerializedName("valute")
    val valute: Map<String, CurrencyDto>
)

/**
 * Class describes exchange rate against ruble
 *
 * @property id unique identifier of exchange rate
 * @property numCode numeric code of exchange rate
 * @property charCode char code of exchange rate
 * @property nominal amount of currency equal value ( 10 HKD (nominal) = 93 RUB (value))
 * @property name name of currency in Russian
 * @property value
 * @property previous
 */
class CurrencyDto(
    @SerializedName("id")
    val id: String,
    @SerializedName("numCode")
    val numCode: String,
    @SerializedName("charCode")
    val charCode: String,
    @SerializedName("nominal")
    val nominal: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("value")
    val value: Double,
    @SerializedName("previous")
    val previous: Double?,
)