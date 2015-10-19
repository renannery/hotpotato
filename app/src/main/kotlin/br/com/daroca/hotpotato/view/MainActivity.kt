package br.com.daroca.hotpotato.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.daroca.hotpotato.R
import br.com.daroca.hotpotato.network.Service
import kotlinx.android.synthetic.activity_main.*;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btSendPotato.setOnClickListener {
            Toast.makeText(this, "Ai carai Mandou!", Toast.LENGTH_SHORT).show()
        }

        btCreatePotato.setOnClickListener {
            Toast.makeText(this, "Ai carai Criou!", Toast.LENGTH_SHORT).show()
        }
    }
}
