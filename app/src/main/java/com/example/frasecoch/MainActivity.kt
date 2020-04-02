package com.example.frasecoch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myButton.setOnClickListener(View.OnClickListener {
            clique(myButton)
        })
    }

    fun clique(view : View) {
        var numero = Random.nextInt(1, 5)

        var frase = when (numero) {
            1 -> getString(R.string.frase1)
            2 -> getString(R.string.frase2)
            3 -> getString(R.string.frase3)
            4 -> getString(R.string.frase4)
            5 -> getString(R.string.frase5)
            else -> "seja seu próprio chefe!"
        }
        textFrase.text = frase
    }
}
