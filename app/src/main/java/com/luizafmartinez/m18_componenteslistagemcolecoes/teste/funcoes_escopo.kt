package com.luizafmartinez.m18_componenteslistagemcolecoes.teste

// Let , Run, With, Apply, Also

data class Produto2(
    var nome: String,
    var preco: Double
) {
    fun desativar() {
        println("Produtoi $nome com preço $preco foi desativado")
    }
}

fun salvarProduto( produto: Produto2 ) {

}

class AlertaMensagem {

    fun configurarTitulo(titulo: String) = println(titulo)

    fun configurarDescricao(descricao: String) = println(descricao)

    fun configurarCancelar() = println("Ação de cancelar")

    fun configurarConfirmar() = println("Ação de confirmar")
}

    fun main() {

        val alertaMensagem = AlertaMensagem()

   /*     alertaMensagem.configurarTitulo("Confirmar salvar ?")
        alertaMensagem.configurarDescricao("Você tem certeza...")
        alertaMensagem.configurarCancelar()
        alertaMensagem.configurarConfirmar()*/



   /* var produto: Produto2? = null

    produto = Produto2("Notebook", 1200.00)*/

    /*produto?.run {
        desativar()
    }*/


   /* val novoObjeto = with( produto ) {
        desativar()
        this.
    }*/


   /*
    // user pode escolher ou não um produto
    produto = Produto2("Notebook", 1200.00)

    *//*if (produto != null) {
        produto.preco = 1100.00
        salvarProduto( produto )
    }*//*

    produto?.let {item ->    // Retorna um objeto produto
        item.preco = 1100.00
        item.nome = "Alterado"
        salvarProduto( produto )
    }

    val novoProduto = produto?.let {item ->
        item.preco = 1100.00
        //item.nome = "Alterado"
        //salvarProduto( produto )
        item
    }

    val novoProduto2 = produto?.let {it ->
        it.preco = 1100.00
        //item.nome = "Alterado"
        //salvarProduto( produto )
        it
    }

    println(produto?.nome )
    println(produto?.preco )

    println(novoProduto?.nome )
    println(novoProduto?.preco )

    println(novoProduto2?.nome )
    println(novoProduto2?.preco )*/

}