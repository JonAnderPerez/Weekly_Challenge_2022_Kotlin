 package com.jonanpg.weeklychallenge2022kotlin

/**
 * Created by JonanPG by Jon Ander Perez on 01/08/2022.
 * www.jonanpg.com
 *
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 */

fun main () {
    val palabra = "roma"
    val anagrama = "am or"

    if (esAnagrama(palabra, anagrama)) println("La palabra \"$anagrama\" es anagrama de \"$palabra\"")
    else println("La palabra \"$anagrama\" no es anagrama de \"$palabra\"")
}

fun esAnagrama(palabra: String, anagrama: String): Boolean {
    var palabra1 = palabra
    var palabra2 = anagrama

    //Si queremos comprobar si una frase es un anagrama eliminamos los espacios
    palabra1 = palabra1.replace(" ", "")
    palabra2 = palabra2.replace(" ", "")

    //Si no tienen la misma longitud o son la misma palabra no son anagramas
    if (palabra1.length != palabra2.length || palabra1 == palabra2) return false

    //Iteramos letra a letra la primera palabra para comprobar que es un anagrama
    var palabraIterable = palabra1.asIterable()
    palabraIterable.forEach {
        when (palabra2.contains(it, true)) {
            true -> palabra2.replaceFirst("$it", "", true)
            false -> return false
        }
    }

    return true
}