package com.jonanpg.weeklychallenge2022kotlin

import java.math.BigDecimal

/**
 * Created by JonanPG by Jon Ander Perez on 01/08/2022.
 * www.jonanpg.com
 *
 * Reto #2
 * LA SUCESIÓN DE FIBONACCI
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 */

fun main() {
    var x = BigDecimal.ZERO
    var y = BigDecimal.ONE
    var n: BigDecimal

    //Imprimimos los dos primeros numeros que simepre son los mismos
    println("Serie Fibonnaci 1: $x")
    println("Serie Fibonnaci 2: $y")
    for (i in 2 until 50 ) {
        n = y //Guardamos en una variable auxiliar el valor de y
        y += x //Calculamos el numero actual de Fibonnaci

        println("Serie Fibonnaci ${i + 1}: $y")

        x = n //Guardamos el valor anterior de y en x
    }
}