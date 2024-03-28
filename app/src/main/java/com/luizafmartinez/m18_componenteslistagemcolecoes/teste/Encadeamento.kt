package com.luizafmartinez.m18_componenteslistagemcolecoes.teste

class Mensagem(
    val mensagem: String,
    val duracao: Int
) {

    companion object {

        const val DURACAO_CURTA = 0
        const val DURACAO_LONGA = 1

        fun construirTexto(mensagem: String, duracao: Int) : Mensagem {

            /*val mensagem = Mensagem()
            return mensagem*/   //OU dar retorno direto
            return Mensagem( mensagem, duracao )
        }
    }

    fun exibir() {

        println("M: ${this.mensagem} ${this.duracao} ")
    }

}

fun main() {

   /* Mensagem.construirTexto(
        "Olá",
        Mensagem.DURACAO_LONGA
    ).exibir()*/

    Mensagem.construirTexto(
        "Olá",
        Mensagem.DURACAO_LONGA
    ).exibir()
}