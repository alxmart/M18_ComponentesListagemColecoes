package com.luizafmartinez.m18_componenteslistagemcolecoes

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.luizafmartinez.m18_componenteslistagemcolecoes.teste.Produto

class MainActivity : AppCompatActivity() {

    private lateinit var btnExecutar: Button

    private lateinit var textResultado: TextView

    fun salvarProduto(produto: Produto) {
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        /*val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("nome","Jamilton")
        startActivity(intent)*/

        btnExecutar = findViewById(R.id.btn_executar)
        textResultado = findViewById(R.id.text_resultado)
        //println(Recursos.id.text_numero); // Classe id, dentro da Classe Recursos
        /*btnExecutar.setOnClickListener {
            textResultado.text = "jamilton"
        }*/
    }

    fun cliqueBotao(view: View) {

        //Encadeamento de métodos ( makeText() / Show() )
        Toast.makeText(
            this,
            "Sucesso ao fazer algo",
            Toast.LENGTH_LONG
        ).show()

        textResultado.text = "jamilton"
    }
}