package com.luizafmartinez.m18_componenteslistagemcolecoes.teste

fun main() {

    val listaFrutas = listOf("maçã", "laranja", "banana")
    val novaLista = listaFrutas.filter { fruta ->
        fruta == "laranja"
    }
    println(novaLista)

    val listaVendas = listOf(100, 500, 150, 1500, 800, 650)
    /*val novaListaVendas = listaVendas.filter { valor ->
        valor >= 600
    } */

    val novaListaVendas = listaVendas.filter { it >= 500 }
    println(novaListaVendas)

    val nomes = listOf("jamilton", "pedro", "ana")
    val novaNomes = nomes.filter { nome ->
        nome.contains("a") //true or false
    }
    println(novaNomes)



}