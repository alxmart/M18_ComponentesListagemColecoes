package com.luizafmartinez.m18_componenteslistagemcolecoes.teste

fun main() {

    //listaInt = intArrayOf(10, 20, 30, 40, 50)

    val lista = arrayOf("jamilton", "maria", "pedro", "ana")

    println(lista[0]) //Não usar mais lista.get(0)

    val novaLista = lista.plus( "joao")//cria nova lista adiciona joao

    lista.forEach { item ->
        println( item )
    }

    novaLista.forEach { item ->
        println( item )
    }

    println(lista.size)

    println(novaLista.size)

    println("Posição de Maria no Array: ${novaLista.indexOf("maria")}")

    println(lista.first()) // jamilton

    println(lista.last()) // ana

    println(lista.contains("maria")) // true

    println(lista.shuffle()) //Embaralha mas nao mostra

    lista.forEach { item ->
        println( item )
    }

}


