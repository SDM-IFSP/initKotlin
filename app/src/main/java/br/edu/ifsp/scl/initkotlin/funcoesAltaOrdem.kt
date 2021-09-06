package br.edu.ifsp.scl.sdm.initkotlin

fun processaTexto(
        str1: String,
        str2: String,
        processa: (s1: String, s2: String) -> String
): String {
    return processa(str1, str2)
}

fun concatena(a: String, b: String): String {
    return "${a + b}"
}

fun invert(a: String, b: String): String = "${a.reversed() + b.reversed()}"

fun main() {
    val nome: String = "Pedro"
    val sobrenome: String = "Nobile"
//    println(concatena(nome, sobrenome))
//    println(invert(nome, sobrenome))

    val funcao: (String, String) -> String = ::concatena
    val fucao2 = ::invert
    val funcao3 = { a: String, b: String ->
        "${a.toLowerCase() + b.toLowerCase()}"
    }

//    println(processaTexto(nome, sobrenome, ::concatena))
    println(processaTexto(nome, sobrenome, funcao))
//    println(processaTexto(nome, sobrenome, ::invert))
    println(processaTexto(nome, sobrenome, fucao2))
    println(processaTexto(nome, sobrenome, funcao3))
    println(
            processaTexto(nome, sobrenome, { a, b ->
                "${a.toLowerCase() + b.toLowerCase()}"
            })
    )
    println(
            processaTexto(nome, sobrenome) { a, b ->
                "${a.toLowerCase() + b.toLowerCase()}"
            })
}