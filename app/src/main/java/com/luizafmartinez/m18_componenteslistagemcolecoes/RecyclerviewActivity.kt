package com.luizafmartinez.m18_componenteslistagemcolecoes

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerviewActivity : AppCompatActivity() {

    private lateinit var rvLista: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recyclerview)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val lista = listOf(
            Mensagem("Jamilton", "Olá, tudo bem ?", "10:45"),
            //Testando o StaggeredGrid Layout: (texto grande)
            Mensagem(
                "Ana",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum",
                "00:45"
            ),
            //Mensagem("Ana", "Te vi ontem..", "00:45"),
            Mensagem("Maria", "Não acredito...", "06:03"),
            Mensagem("Pedro", "Futebol hoje ?", "15:32")
        )

        rvLista = findViewById(R.id.rv_lista)

        //Tem que ser do tipo "MensagemAdapter" e "Adapter"
        rvLista.adapter = MensagemAdapter(lista) { nome ->

            Toast.makeText(this, "Olá $nome", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, ListViewActivity::class.java)
            intent.putExtra("nome", nome)

            startActivity(
                Intent(this, ListViewActivity::class.java)
            )

        }

        rvLista.layoutManager = LinearLayoutManager(
            this,
            RecyclerView.VERTICAL,
            false
        )

        // Adicionando um Divisor:
        /*rvLista.addItemDecoration(
            DividerItemDecoration(
                this,
                RecyclerView.VERTICAL
            )
        )*/

        // StaggeredGrid Layou MAnager
        /*rvLista.layoutManager = StaggeredGridLayoutManager(
            2,
            RecyclerView.VERTICAL
        )*/

        // Grid Layout Manager
        /*
        rvLista.layoutManager = GridLayoutManager(
            this,
            2
        )*/

        // Linear Layout Manager (Configurar com XML ou Código)
        // Código Kotlin:
        /*rvLista.layoutManager = LinearLayoutManager(
            this,
            RecyclerView.VERTICAL,
            false
        )*/

    }
}