package com.jonanpg.weeklychallenge2022kotlin

/**
 * Created by JonanPG by Jon Ander Perez on 01/08/2022.
 * www.jonanpg.com
 *
 * Reto #0
 * EL FAMOSO "FIZZ BUZZ"
 * Dificultad: FÁCIL
 *
 * Enunciado: Escribe un programa que muestre por consola (con un print) los números de 1 a 100 (ambos incluidos y con un salto de línea entre cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

fun main() {
    for (x in 1..100) {
        if ((x % 3 == 0) && (x % 5 == 0)) {
            println("fizzbuzz")
        } else if ((x % 3 == 0)) {
            println("fizz")
        } else if ((x % 5 == 0)) {
            println("buzz")
        } else {
            println(x)
        }
    }
}