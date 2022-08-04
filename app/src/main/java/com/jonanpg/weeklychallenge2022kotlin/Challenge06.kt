package com.jonanpg.weeklychallenge2022kotlin

/**
 * Created by JonanPG by Jon Ander Perez on 04/08/2022.
 * www.jonanpg.com
 *
 * Reto #6
 * INVIRTIENDO CADENAS
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa que invierta el orden de una cadena de texto sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */

fun main() {
	val original = " "
	
    if (original.trim().length > 0) {
        var palModificada: String? = palabraRecursiva(original)
    	println("La palabra original es \"$original\", y la modificada es \"$palModificada\".")
    } else {
        println("La palabra seleccionada no se puede revertir...")
    }
}

private fun palabraRecursiva(original: String): String {
    var modificada = ""
    for (i in original.length downTo 1) {
        modificada += original.get(i - 1)
    }
    return modificada
}