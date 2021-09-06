package br.edu.ifsp.scl.sdm.initkotlin

import android.text.BoringLayout

fun multiplo(a: Int, b: Int): Boolean {
    val c: Int = a % b
    if (c == 0) {
        return true
    }
    return false
}

fun Int.mutiploo(b: Int): Boolean {
    return multiplo(this, b)
}

fun main() {
    println(multiplo(10, 2))
    println(11.mutiploo(2))
}


