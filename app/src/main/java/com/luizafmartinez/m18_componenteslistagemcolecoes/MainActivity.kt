package com.luizafmartinez.m18_componenteslistagemcolecoes

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.luizafmartinez.m18_componenteslistagemcolecoes.teste.Recursos

class MainActivity : AppCompatActivity() {

    private lateinit var btnExecutar: Button
    private lateinit var textResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnExecutar = findViewById(R.id.btn_executar)
        textResultado = findViewById(R.id.text_resultado)

        //println(Recursos.id.text_numero); // Classe id, dentro da Classe Recursos

      /*  btnExecutar.setOnClickListener {
            textResultado.text = "jamilton"
        }*/

        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/
    }

    fun cliqueBotao(view: View) {

        btnExecutar.setOnClickListener {
            //view.id.
            textResultado.text = "jamilton"
        }
    }
}