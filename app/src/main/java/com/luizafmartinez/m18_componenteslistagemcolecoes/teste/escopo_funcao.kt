package com.luizafmartinez.m18_componenteslistagemcolecoes.teste

var nome = "jamilton" // Escopo GLOBAL

class Pessoa {

    val nome : String = ""  // Escopo local
}


fun executar() {

    val nome = "executou novo nome Ana"  // Escopo local
}

fun main() {


    executar()
    nome = "voltou para jamilton"
    println(nome)
    //nome = "Executou novo nome Ana"
    //println(nome)




}