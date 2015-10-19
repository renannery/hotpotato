package br.com.daroca.hotpotato.network

import com.squareup.okhttp.Interceptor
import com.squareup.okhttp.OkHttpClient
import com.squareup.okhttp.Request
import com.squareup.okhttp.Response

import java.io.IOException
import java.util.concurrent.TimeUnit

import br.com.daroca.hotpotato.controller.Config
import retrofit.GsonConverterFactory
import retrofit.Retrofit

class API {

    init {

        if (REST_ADAPTER == null) {

            val client = OkHttpClient()
            client.setConnectTimeout(0, TimeUnit.MILLISECONDS)
            client.interceptors().add(object : Interceptor {
                @Throws(IOException::class)
                override fun intercept(chain: Interceptor.Chain): Response {
                    val original = chain.request()

                    val request = original.newBuilder().header("Accept", "application/json").header("Accept-Language", "pt-BR").method(original.method(), original.body()).build()

                    val response = chain.proceed(request)

                    return response
                }
            })


            REST_ADAPTER = Retrofit.Builder().baseUrl(Config.PREFIX_PROD).client(client).addConverterFactory(GsonConverterFactory.create()).build()
        }
    }

    fun service(): EndpointInterface {
        return REST_ADAPTER!!.create(EndpointInterface::class.java)
    }


    interface EndpointInterface

    companion object {

        private var REST_ADAPTER: Retrofit? = null
    }
}