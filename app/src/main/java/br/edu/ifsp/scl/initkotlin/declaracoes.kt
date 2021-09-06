package br.edu.ifsp.scl.sdm.initkotlin

fun main(){
    //declarar variavel
    var frase: String = "Hello World!"

    //imprimir
    println(frase)
    println("$frase")
    println("${frase}")
    println("qtd caracteres: ${frase.count()}")

    println("qtd letra l: ${frase.count {letra: Char ->
        letra == 'l'
    }}")

    println("qtd caracteres: ${frase.length}")
}