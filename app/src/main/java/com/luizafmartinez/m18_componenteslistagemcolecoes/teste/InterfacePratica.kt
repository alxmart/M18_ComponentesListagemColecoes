package com.luizafmartinez.m18_componenteslistagemcolecoes.teste

// DRY -> Don't repeat yourself / Não repita código !
// Classes -> Divisão de responsabilidade
// Alto Acoplamento e Baixo Acoplamento
// Classes devem utilizar outras classes   ( "... e não criar outras classes )

class Musico {

    fun tocar() {
        val violao = Violao()   // Alto Acoplamento
        // Classes devem utilizar outras classes   ( "... e não criar outras classes )
        println("Músico tocando")
        violao.sendoTocado()
    }
}

class Violao {

    fun sendoTocado() {
        println("Utilizando cordas (20 linhas de código)")
        println("para tocar o violão")
    }

}

class Bateria {

    fun tocandoBateria() {

        println("Utilizando baquetas (20 linhas de código)")
        println("para tocar a bateria")
    }
}

fun main() {

    // Tela 1 (Violão)
    val musico1 = Musico()
    musico1.tocar()
    println("++++++++++++++++++++++++++++++")

    // Tela 2 (Violão)
    val musico2 = Musico()
    musico2.tocar()
    println("++++++++++++++++++++++++++++++")

    // Tela 3 (Bateria)
    val musico3 = Musico()
    musico3.tocar()
    println("++++++++++++++++++++++++++++++")



}