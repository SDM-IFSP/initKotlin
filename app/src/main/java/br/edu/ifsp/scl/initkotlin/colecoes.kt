package br.edu.ifsp.scl.sdm.initkotlin

fun main(){
    var familia: List<String> = listOf("Paula", "Dayane")

    for (integrante in familia){
        println(integrante)
    }

    val listaInteiros: List<Int> = (1..10).toList()
    for (i in 0..9){
    //  println(listaInteiros.get(i))
        println(listaInteiros[i])
    }
    println("Imprimindo com lambda")
    // listaInteiros.forEach({ println((it)) })
    listaInteiros.forEach { println((it)) }

    val listaCursos: MutableList<String> = mutableListOf(
            "Sistema para Dispositivos Móveis",
            "Análise de desenvolvimento"
    )
    listaCursos.add("Técnico para Sistemas de Informação")
    listaCursos.add("Técnico para Sistemas de Informação")
    listaCursos.add("Técnico para Sistemas de Informação")

    listaCursos.forEach { println(it) }

    //nao add repetido
    val setCursos: MutableSet<String> = mutableSetOf("ADS", "SDM", "TII")
    setCursos.add("TII")
    setCursos.add("TII")
    setCursos.add("TII")
    setCursos.add("TII")
    setCursos.forEach { println(it) }

    val familiaMap: MutableMap<String, String> = mutableMapOf(
            Pair("pai", "Pedro"),
            Pair("filho", "JP"),
            Pair("mae", "Silvia")
    )
    familiaMap.put("Pet", "Miau")
    familiaMap.keys.forEach {println("$it: ${familiaMap.get(it)}")}
    val mapJava: HashMap<String, String> = HashMap()
}