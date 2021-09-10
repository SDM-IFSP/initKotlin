package br.edu.ifsp.scl.initkotlin

enum class TipoOperacao {
    //como se tivesse criando const dentro da classe
    ADD, MUL, DIV, SUB
}

fun div(a: Int, b: Int): Int = a / b

fun operacao(op: TipoOperacao): (Int, Int) -> Int {
    val sub = {a: Int, b: Int ->  a - b}

    when (op) {
        TipoOperacao.ADD -> {
            // lambda
            return {x, y -> x + y }
        }
        TipoOperacao.MUL -> {
            //funcao
            return fun (a, b) = a * b
        }
        TipoOperacao.DIV -> {
           return ::div
        }
        TipoOperacao.SUB -> {
            return sub
        }
    }
}

fun Int.aplica(i: Int, f: (Int, Int) -> Int) = f(this, i)

fun main(){
    println(10.aplica(2, operacao(TipoOperacao.ADD) ))
    println(10.aplica(2, operacao(TipoOperacao.MUL) ))
    println(10.aplica(2, operacao(TipoOperacao.DIV) ))
    println(10.aplica(2, operacao(TipoOperacao.SUB) ))

}