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


/*
fun executar() {

    println("Executar")
}

fun executar2() = println("Executar")
*/

/*class Botao {
    //fun configurarCliqueBotao( funcao: () -> Unit ) {
    //fun configurarCliqueBotao() {
    fun configurarCliqueBotao( nome: String, funcao: () -> Unit ) {
        //println("Executou função lambda")
        funcao()
        println("Nome: $nome")
    }
}*/

class Botao {
    fun configurarCliqueBotao( funcao: (String) -> Unit ) {

      funcao("Jamilton")
}

fun main() {

    val botao = Botao()

    botao.configurarCliqueBotao { nome ->
        println("Executou função lambda. Executou $nome")
    }

   /*
    //Função Lambda
   val funcaoLambda =  { nome: String, idade: Int -> // Criou um parâmero para a função lambda
        println("Executar nome: $nome $idade")
    }
    //Chamar Função Lambda
    funcaoLambda("Jamilton", 35)
    */


     //val matematica = Matematica()

            //val retorno = matematica.somar(10,5)*/

            //val retorno = somar(10, 5)
            //val retorno = calcular(::somar)

            //calcular(10,5)

            //calcular(::somar) // Passou a função

    //calcular( matematica::somar) // Passou o método somar da classe MAtematica

    //println(retorno)

}
