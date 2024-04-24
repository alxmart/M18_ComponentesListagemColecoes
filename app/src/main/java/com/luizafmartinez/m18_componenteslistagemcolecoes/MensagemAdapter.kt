package com.luizafmartinez.m18_componenteslistagemcolecoes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MensagemAdapter(
    private val lista: List<Mensagem>
) : RecyclerView.Adapter<MensagemAdapter.MensagemViewHolder>()  {

    // Classe que vai armazenar a visualizacao. Vai utilizar o item_lista.xml

    inner class MensagemViewHolder(
        val itemView: View
    ) : ViewHolder( itemView ) { // Qual a View que vai ser utilizada
         /*
         val textNome   : TextView = itemView.findViewById(R.id.text_nome)
         val textUltima : TextView = itemView.findViewById(R.id.text_ultima)
         */
         // Trocando para usar o CardView: (text_card_nome/text_card_ultima)
         val textNome: TextView = itemView.findViewById(R.id.text_card_nome)
         val textUltima: TextView = itemView.findViewById(R.id.text_card_ultima)
       //val textHora   : TextView = itemView.findViewById(R.id.text_horario)
         val imagePerfil: ImageView = itemView.findViewById(R.id.image_card_perfil)
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
    override fun onBindViewHolder(mensagemViewHolder: MensagemViewHolder, position: Int) {
        val mensagem = lista[position]
        mensagemViewHolder.textNome.text = mensagem.nome
        mensagemViewHolder.textUltima.text = mensagem.ultima
        //holder.textHora.text = mensagem.horario

        // Aplicar eventos de clique
        val context = mensagemViewHolder.imagePerfil.context
        mensagemViewHolder.imagePerfil.setOnClickListener {
            Toast.makeText(
                context,
                "Olá, ${mensagem.nome}",
                Toast.LENGTH_SHORT).show()
        }
    }

    // Recupera a quantidade de itens
    override fun getItemCount(): Int {
        return lista.size
    }

}