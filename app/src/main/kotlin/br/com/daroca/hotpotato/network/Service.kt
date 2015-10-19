package br.com.daroca.hotpotato.network


class Service private constructor() {


    fun login(email: String, password: String) {
        Thread(object : Runnable {

            override fun run() {

            }
        }).start()
    }

    companion object {
        fun newInstance(): Service {
            return Service()
        }
    }
}
