package com.luizafmartinez.m18_componenteslistagemcolecoes.teste


fun main() {

    val listaLanches = listOf("Hamburguer", "Batata frita")
    val listaEntradas = listOf("Coxa de frango", "Pipoca")

    val novaLista = listaLanches.union(listaEntradas)
    println(novaLista)

    val novaLista2 = listaEntradas + listaLanches
    println(novaLista2)

    val listaExclusao = listOf("Batata frita")

    val listaFinal = novaLista2 - listaExclusao
    println(listaFinal)


}