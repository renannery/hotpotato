package br.com.daroca.hotpotato.controller

object Config {

    private val API_VERSION = "v1/"

    val PREFIX_MOCK = "http://private-194cf-qrid.apiary-mock.com/qrid/" + API_VERSION
    val PREFIX_PROD = "http://test.qrid.com.br/qrid/" + API_VERSION

    val MOCK = true


    //Parse push
    val PARSE_APPLICATION_ID = "MALLzWeRRd0niCMdeRFu8Ihi5XLTj0YGVnTanK5I"
    val PARSE_CLIENT_KEY = "w3Alkln31bpDYLjq8oskYaN8PBDZUPTxcUVDJojR"

}