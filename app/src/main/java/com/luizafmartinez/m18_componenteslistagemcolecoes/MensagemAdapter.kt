package com.luizafmartinez.m18_componenteslistagemcolecoes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MensagemAdapter(
    private val lista: List<Mensagem>,
    private val clique: () -> Unit
) : RecyclerView.Adapter<MensagemAdapter.MensagemViewHolder>()  {

    fun configurarClique() {

    }

    // Classe que vai armazenar a visualizacao. Vai utilizar o item_lista.xml

    inner class MensagemViewHolder(
        val itemView: View
    ) : ViewHolder( itemView ) { // Qual a View que vai ser utilizada
         /*
         val textNome   : TextView = itemView.findViewById(R.id.text_nome)
         val textUltima : TextView = itemView.findViewById(R.id.text_ultima)
         */
         // Trocando para usar o CardView: (text_card_nome/text_card_ultima)
         val textNome:    TextView = itemView.findViewById(R.id.text_card_nome)
         val textUltima:  TextView = itemView.findViewById(R.id.text_card_ultima)
         val imagePerfil: ImageView = itemView.findViewById(R.id.image_card_perfil)
         val cardView:    CardView = itemView.findViewById(R.id.card_view_layout)
       //val textHora   : TextView = itemView.findViewById(R.id.text_horario)


         fun bind( mensagem: Mensagem) {  //Conectar com a interface

            textNome.text = mensagem.nome
            textUltima.text = mensagem.ultima
             //holder.textHora.text = mensagem.horario

             //val context = cardView.context
             cardView.setOnClickListener {
                 clique()
             }

             // Aplicar eventos de clique:
             /*val context = mensagemViewHolder.imagePerfil.context
             mensagemViewHolder.imagePerfil.setOnClickListener {
                 Toast.makeText(
                     context,
                     "Olá, ${mensagem.nome}",
                     Toast.LENGTH_SHORT).show()
             }
             */


         }

    }

    // Vai criar a visualização
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MensagemViewHolder {

        val layoutInflater = LayoutInflater.from(
            parent.context
        )
        /*val itemView = layoutInflater.inflate(
            R.layout.item_lista,parent,false
        ) */
        // Trocando para usar o CardView
        val itemView = layoutInflater.inflate(
            R.layout.item_cardview,parent,false
        )
        return MensagemViewHolder( itemView )
    }

    // Ao vincular os dados para o ViewHolder
    // Executa n vezes de acordo com getItemCount
    override fun onBindViewHolder(holder: MensagemViewHolder, position: Int) {

        val mensagem = lista[position]

        holder.bind( mensagem )
    }

    // Recupera a quantidade de itens
    override fun getItemCount(): Int {
        return lista.size
    }

}