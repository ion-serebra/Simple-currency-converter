package com.noshaev.simplecurrencyconverter.di.network

import com.noshaev.simplecurrencyconverter.data.remote.CentralBankRussiaPublicApi
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit

@Module
class NetworkModule {
    companion object {
        private const val DEFAULT_TIMEOUT_MS = 4L
        private const val CBR_URL = "https://www.cbr-xml-daily.ru/"
    }

    @Provides
    fun provideCentralBankRussiaApi(
        retrofit: Retrofit
    ): CentralBankRussiaPublicApi = retrofit.create(CentralBankRussiaPublicApi::class.java)

    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(CBR_URL)
            .build()
    }

    @Provides
    fun provideOkHttp(
    ): OkHttpClient {
        return OkHttpClient.Builder()
            .callTimeout(DEFAULT_TIMEOUT_MS, TimeUnit.SECONDS)
            .connectTimeout(DEFAULT_TIMEOUT_MS, TimeUnit.SECONDS)
            .readTimeout(DEFAULT_TIMEOUT_MS, TimeUnit.SECONDS)
            .build()
    }
}