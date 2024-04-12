package com.luizafmartinez.m18_componenteslistagemcolecoes.teste

data class Cliente(
    val nome: String,
    val idade: Int
)

fun main() {

    val cliente1 = Cliente("Jamilton", 35)
    val cliente2 = Cliente("Ana", 22)

    val listaClientes = mutableListOf(
        cliente1,cliente2
    )

    listaClientes.forEach { cliente ->
        println("Cliente: ${cliente.nome} - ${cliente.idade}")
    }
    // Saída;
    // Cliente: Jamilton - 35
    // Cliente: Ana - 22

    // listaClientes.clear()

    // listaClientes.shuffle()



    //===========================================================================


    //val listaArray = arrayOf("jamilton", "ana")//Não pode adicionar mais items

    //listaArray[0] = "Jamilton Alterado"

    //val listaARray: List<String> = listOf("jamilton", "ana")

    /*val lista = mutableListOf("jamilton","ana")

    lista[0] = "Jamilton Alterado"

    lista.add("márcia")

    lista.forEach { item ->
        println(item)
    }
    // Jamilton Alterado / ana / márcia

    val novaLista = listOf("marcelo","marcela")
    lista.addAll(novaLista)

    lista.forEach { item ->
        println(item)
    }
    //Jamilton Alterado / ana / márcia / marcelo / marcela

    //Para remover Ana:

    // lista.remove("ana")
    lista.removeAt(1) // Remove posicao 1 : ana
    lista.forEach { item ->
        println(item)
    }*/



}
