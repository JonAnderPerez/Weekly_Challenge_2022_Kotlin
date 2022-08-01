package com.jonanpg.weeklychallenge2022kotlin

/**
 * Created by JonanPG by Jon Ander Perez on 01/08/2022.
 * www.jonanpg.com
 *
 * Reto #3
 * ¿ES UN NÚMERO PRIMO?
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */

fun main() {
    for (i in 1..100)
        if (esPrimo(i)) println("El número $i es primo")
}

fun esPrimo(num: Int): Boolean {
    if (num < 2) return false
    for (n in 2 until num)
        if (num % n == 0) return false
    return true
}