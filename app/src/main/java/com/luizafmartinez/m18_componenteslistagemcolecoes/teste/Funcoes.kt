package com.luizafmartinez.m18_componenteslistagemcolecoes.teste

class Matematica {

    // Método
    fun somar(n1:Int, n2:Int) : Int {
        return n1 + n2
    }
}

// Função
fun somar(n1:Int, n2:Int) : Int {

    return n1 + n2
}

fun calcular( funcao: (Int, Int) -> Int ) {

    val retorno = funcao(10,5)

    println(retorno)
}

fun main() {

     val matematica = Matematica()

    //val retorno = matematica.somar(10,5)*/

    //val retorno = somar(10, 5)
    //val retorno = calcular(::somar)

    //calcular(10,5)

    //calcular(::somar) // Passou a função

    calcular( matematica::somar) // Passou o método somar da classe MAtematica

    //println(retorno)

}
