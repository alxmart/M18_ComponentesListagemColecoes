package com.luizafmartinez.m18_componenteslistagemcolecoes.teste

data class Produto(
    val nome: String
)

fun main() {

    // val listaItens = listOf("jamilton","ana")
    //val lista = mapOf(0 to "jamilton", 1 to "ana")

    var idade : Int

    //val lista = mapOf(102545 to "MacMini", 102546 to "MacBookPRO")

    val lista = mutableMapOf(
        102545 to "MacMini",
        102546 to "MacBookPRO"
    )

    lista.forEach { produto ->
        println(" ${produto.key} - ${produto.value}")
    }

    println("Tamanho da lista: ${lista.size}")

    lista.put(102547, "MacBookAir")

    lista.forEach { produto ->
        println("${produto.key} - ${produto.value}")
    }

    val lista2 = mutableMapOf(
        "101456" to Produto("Notebook"),
        "200455" to Produto("Mouse")
    )

    lista2.forEach { produto ->
        println("${produto.key} - ${produto.value}")
    }

    println(lista2.get("200455"))

    println(lista2["200455"])

    println(lista.size)

    println(lista2.size)

    lista.put(20, "idade")

    lista[21] = "idade"











}