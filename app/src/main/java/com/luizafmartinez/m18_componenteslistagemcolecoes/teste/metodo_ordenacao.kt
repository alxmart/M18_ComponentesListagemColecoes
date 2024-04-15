package com.luizafmartinez.m18_componenteslistagemcolecoes.teste

fun main() {

    val listaNomes = listOf("jamilton", "ana", "maria", "zeus")

    val listanumeros = listOf(2, 1,3)

    val listaNumAsc = listanumeros.sorted()
    val listaNomesAsc = listaNomes.sorted()

    val listaNumDesc = listanumeros.sortedDescending()
    val listaNomesDesc = listaNomes.sortedDescending()

    println(listaNumAsc)
    println(listaNumDesc)

    println(listaNomesAsc)
    println(listaNomesDesc)


}