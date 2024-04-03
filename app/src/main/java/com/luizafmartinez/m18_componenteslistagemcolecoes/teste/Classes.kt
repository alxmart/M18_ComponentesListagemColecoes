package com.luizafmartinez.m18_componenteslistagemcolecoes.teste

class Motorista(val nome: String) {

    fun exibirDadosMotorista() = println("Motorista: $nome")

   /* class Caminhao( val nomeCaminhao: String ) { // nested Class , classe aninhada
        fun exibirDadosCaminhao() = println("Caminhao: $nomeCaminhao")
    }*/

    inner class Caminhao( val nomeCaminhao: String ) { // nested Class , classe aninhada

        fun exibirDadosCaminhao() = println("Caminhao: $nomeCaminhao Motorista: $nome")
        // Acessa o nome que está dentro da classe Motorista
    }

}

fun main() {

    /*val motorista = Motorista("Jamilton")
    motorista.exibirDadosMotorista()*/

    //val motorista = Motorista("Jamilton")

    // Classe Aninhada
//    val caminhao = Motorista.Caminhao("Scania")
//    caminhao.exibirDadosCaminhao()

    // Inner Class:
    val motorista = Motorista("Jamilton")
    val caminhao = motorista.Caminhao("Scania")
    caminhao.exibirDadosCaminhao()

}