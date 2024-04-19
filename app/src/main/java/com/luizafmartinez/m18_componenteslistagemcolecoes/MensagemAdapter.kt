package com.luizafmartinez.m18_componenteslistagemcolecoes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MensagemAdapter(
    private val lista: List<Mensagem>
) : RecyclerView.Adapter<MensagemAdapter.MensagemViewHolder>()  {

    // Classe que vai armazenar a visualizacao. Vai utilizar o item_lista.xml

    inner class MensagemViewHolder(
        val itemView: View
    ) : ViewHolder( itemView ) { // Qual a View que vai ser utilizada

         val textNome   : TextView = itemView.findViewById(R.id.text_nome)
         val textUltima : TextView = itemView.findViewById(R.id.text_ultima)
         val textHora   : TextView = itemView.findViewById(R.id.text_horario)
    }

    // Vai criar a visualização
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MensagemViewHolder {

        val layoutInflater = LayoutInflater.from(
            parent.context
        )

        val itemView = layoutInflater.inflate(
            R.layout.item_lista,
            parent,
            false
        )

        return MensagemViewHolder( itemView )
    }

    // Ao vincular os ados para o ViewHolder
    override fun onBindViewHolder(holder: MensagemViewHolder, position: Int) {

        val mensagem = lista[position]
        holder.textNome.text = mensagem.nome
        holder.textUltima.text = mensagem.ultima
        holder.textHora.text = mensagem.horario

    }

    // Recupera a quantidade de itens
    override fun getItemCount(): Int {

        return lista.size
    }

}