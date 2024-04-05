package com.luizafmartinez.m18_componenteslistagemcolecoes.teste

/*class Motorista(val nome: String) {
    fun exibirDadosMotorista() = println("Motorista: $nome")
   *//* class Caminhao( val nomeCaminhao: String ) { // nested Class , classe aninhada
        fun exibirDadosCaminhao() = println("Caminhao: $nomeCaminhao")
    }*//*
    inner class Caminhao( val nomeCaminhao: String ) { // nested Class , classe aninhada

        fun exibirDadosCaminhao() = println("Caminhao: $nomeCaminhao Motorista: $nome")
        // Acessa o nome que está dentro da classe Motorista
    }
}*/

/*data class Pergunta (
    val pergunta: String,
    val respostaCerta: Int
)*/


/*{
    fun exibirAlgo() {
        println("Exibir Algo")
    }
}*/

//Getter (Conseguir, recuperar) e Setter (Configurar)
/*class Usuario () {

    var nome: String = ""
        get() {
            return field.uppercase()
        }
        set(value) {
            field = "set: $value"   // Pedro é o value !
        }
    var idade: Int = 0

    var maiorIdade = false
        get() = idade >= 18
}*/

fun main() {




    //Get & Set
    /*val usuario = Usuario()
    usuario.nome = "Pedro"  // Já acessa, "por baixo dos panos" o GET
    usuario.idade = 18
    println("Nome: ${usuario.nome} idade: ${usuario.idade} maiorIdade: ${usuario.maiorIdade}")
*/

   /* //Testing using JAVA
    val pessoa = Pessoa()
    pessoa.nome = "Jamilton"   //set
    println("nome: ${pessoa.nome}") //get*/


   /* val pergunta1 = Pergunta("Qual a pergunta ?", 1)
    val pergunta2 = Pergunta("Qual a pergunta ?", 1)

    // Desestruturação
    val (pergunta,resposta) = pergunta1

    val p = pergunta1.pergunta
    val r = pergunta1.respostaCerta

    println(pergunta)
    println(resposta)
    //  End - Desestruturação---------------------
    //--------------------------------------------*/

    //pergunta1.pergunta = "Alterar a pergunta"
    //println(pergunta1)
    // com.luizafmartinez.m18_componenteslistagemcolecoes.teste.Pergunta@7f690630
    //println(pergunta2 )
    // com.luizafmartinez.m18_componenteslistagemcolecoes.teste.Pergunta@edf4efb
    //println( pergunta1 == pergunta2 ) // false

    /*val motorista = Motorista("Jamilton")
    motorista.exibirDadosMotorista()*/

    //val motorista = Motorista("Jamilton")

    // Classe Aninhada
//    val caminhao = Motorista.Caminhao("Scania")
//    caminhao.exibirDadosCaminhao()

    // Inner Class:
   /*
   val motorista = Motorista("Jamilton")
    val caminhao = motorista.Caminhao("Scania")
    caminhao.exibirDadosCaminhao()
    */

}