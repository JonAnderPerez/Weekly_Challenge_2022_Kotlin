package com.jonanpg.weeklychallenge2022kotlin

import kotlin.math.ceil

/**
 * Created by JonanPG by Jon Ander Perez on 04/08/2022.
 * www.jonanpg.com
 *
 * Reto #8
 * DECIMAL A BINARIO
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa se encargue de transformar un número decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */

fun main() {
	println(decimalABinario(548))
    println(decimalABinario(0))
    println(decimalABinario(575))
}

private fun decimalABinario(numeroDecimal: Int): String {
    var decimal: Int = numeroDecimal
    var binario: StringBuilder = StringBuilder()
    
    while(decimal != 0) {
        binario.insert(0, "${decimal % 2}")
        decimal /= 2
    } 
    
    return binario.toString().ifEmpty { "0" }
}