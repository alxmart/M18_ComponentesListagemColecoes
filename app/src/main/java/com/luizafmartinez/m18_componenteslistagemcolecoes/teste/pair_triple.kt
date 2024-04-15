package com.luizafmartinez.m18_componenteslistagemcolecoes.teste

fun main() {

    // val localizacao = 10 to 20
    // ou
    val localizacao = Pair(10,20)

    println(localizacao.first)
    println(localizacao.second)

    val local = Triple(10, 20, "pizzaria")
    println(local.third)

}