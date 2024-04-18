package com.luizafmartinez.m18_componenteslistagemcolecoes.teste

class TomadaAntiga(
    val conector: Conector
) {

    fun passarEnergia() {

        val qtdPinos = conector.quantidadePinos()
        if (qtdPinos == 2) {
            conector.ligarAparelho()
            println("Quantidade de pinos: $qtdPinos")
            println("Passando energia")
        } else {
            println("Esta tomada só funciona com 2 pinos. Vc passou $qtdPinos")
        }
    }
}

interface Conector {

    fun quantidadePinos() : Int

    fun ligarAparelho()
}

class ConectorAdaptador(
    val conectorNovoPadrao: ConectorNovoPadrao
) : Conector {

    override fun quantidadePinos(): Int {
        return 2
    }

    override fun ligarAparelho() {
        conectorNovoPadrao.ligarAparelho()
    }
}

class ConectorNovoPadrao : Conector {

    override fun quantidadePinos() : Int {
        return 3
    }

    override fun ligarAparelho() {
        println("Aparelho está ligado")
        println("Mais de 20 linhas de código...")
    }
}

fun main() {

    val conectorNovoPadrao = ConectorNovoPadrao()

    val conectorAdaptador = ConectorAdaptador( conectorNovoPadrao )

    //val tomadaAntiga = TomadaAntiga( conectorNovoPadrao )
    val tomadaAntiga = TomadaAntiga( conectorAdaptador )

    tomadaAntiga.passarEnergia()
}