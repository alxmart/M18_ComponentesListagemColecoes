package com.luizafmartinez.m18_componenteslistagemcolecoes.teste

// DRY -> Don't repeat yourself / Não repita código ! (ok)
// Classes -> Divisão de responsabilidade (ok)
// Classes devem utilizar outras classes  ("...e não criar outras classes") (ok)
// Alto Acoplamento e Baixo Acoplamento (ok)

class Musico( val instrumento: Instrumento ) {  // Passando um objeto no construtor

    fun tocar() {
        //val violao = Violao()   // Alto Acoplamento
        // Classes devem utilizar outras classes  ("...e não criar outras classes)
        println("Músico tocando")
        instrumento.sendoTocado()
        //instrumento.tocandoBateria()  // Bateria tem outro método
    }
}

// Herança e Interface (Contrato) -> Composição

// HERANÇA
/*abstract class Instrumento {
    abstract fun sendoTocado()
}*/

// INTERFACE
interface Instrumento {
    fun sendoTocado()
}

// Herança:
// class Violao : Instrumento() {//Dois tipos: Violao(class) e Instrumento(Interface)
// Interface:
class Violao : Instrumento {  // Dois tipos: Violao e Instrumento

    override fun sendoTocado() {
        println("Utilizando cordas (20 linhas de código)")
        println("para tocar o violão")
    }

    fun ajustarCordas() {
        println("Ajustar cordas")
    }
}
// Herança:
//class Bateria : Instrumento() {  // Dois tipos: Bateria e Instrumento
// Interface:
class Bateria : Instrumento {  // Dois tipos: Bateria e Instrumento

    override fun sendoTocado() {
        println("Utilizando baquetas (20 linhas de código)")
        println("para tocar a bateria")
    }

    fun ajustarBaqueta() {
        println("Ajustar baqueta")
    }
}

    class Guitarra : Instrumento{

        override fun sendoTocado() {
            println("Utilizando cordas (20 linhas de código)")
            println("Utilizando alavanca")
            println("para tocar a guitarra")
        }
    }

class Activity {
    fun putExtra() {

    }
}

fun main() {

    //val violao : Instrumento = Violao()
    //val bateria: Instrumento = Bateria()

    /*// Tela 1 (Violão)
    val violao1 = Violao()
    val musico1 = Musico( violao1 )
    musico1.tocar()
    println("++++++++++++++++++++++++++++++")

    // Tela 2 (Violão)
    val violao2 = Violao()
    val musico2 = Musico( violao2 )
    musico2.tocar()
    println("++++++++++++++++++++++++++++++")

    // Tela 3 (Bateria)
    val bateria1 = Bateria()
    val musico3 = Musico( bateria1 ) //Bateria como Instrumento(métodos de intrumento)
    musico3.tocar()
    println("++++++++++++++++++++++++++++++")

    // Tela 4 (Guitarra)
    val guitarra = Guitarra()
    val musico4 = Musico( guitarra ) // Dois tipos: Guitarra e instrumento
    musico4.tocar()*/

}