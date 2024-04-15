package com.luizafmartinez.m18_componenteslistagemcolecoes.teste

fun converteMaiusculas( texto: String) : String {
    return texto.uppercase()
}

fun main() {

    val lista = listOf("jamilton", "pedro", "ana", "maria")

    /*val novaLista = mutableListOf<String>()
    lista.forEach { nome ->
        //println(nome.uppercase())
        novaLista.add( nome.uppercase() )
    }
    println(novaLista)*/

    /*val novaLista = lista.map { nome ->
        //nome.uppercase()
        "+ $nome"
    }
    println(novaLista)*/

    /*val novaLista = lista.map { nome ->
        converteMaiusculas(nome)
    }
    println(novaLista)*/

    val novaLista = lista.map{it.uppercase()}
    println(novaLista)




}

