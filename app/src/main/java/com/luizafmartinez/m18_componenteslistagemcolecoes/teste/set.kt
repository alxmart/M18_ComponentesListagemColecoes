package com.luizafmartinez.m18_componenteslistagemcolecoes.teste

data class Carro(
    val nome: String,
    val marca: String
)

fun main() {

    // SET - Lista de itens que não se repetem
    //val lista = setOf("jamilton", "ana", "pedro", "maria", "ana")

    //val lista = mutableSetOf("jamilton", "ana", "pedro", "maria", "ana")

    val lista = mutableSetOf(
        Carro("Evoque","Land Rover"),
        Carro("Navigator","Lincoln"),
        Carro("Charger","Dodge")
    )

    //lista.add("Mariana")

    //lista.remove("ana")

    // lista.clear()

    /*lista.forEach { nome ->
        println( nome )
    }*/

    lista.forEach { car ->
        println( car )
    }
    // Obs: Não se utiliza indices para fazer exibição. println(lista[0])

    // val novaLista = lista.plus("ana")  // Não vai se repetir

    println("Tamanho da lista: ${lista.size} itens")

    //println( lista.indexOf("jamilton") )

    // ==================================================
    //  MutableSetOf
    //===================================================












}