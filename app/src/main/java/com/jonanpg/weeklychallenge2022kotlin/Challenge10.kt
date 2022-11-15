package com.jonanpg.weeklychallenge2022kotlin

/*
 * * Created by JonanPG by Jon Ander Perez on 15/11/2022.
 * www.jonanpg.com
 * 
 * Reto #10
 * EXPRESIONES EQUILIBRADAS
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que comprueba si los paréntesis, llaves y corchetes de una expresión están equilibrados.
 * - Equilibrado significa que estos delimitadores se abren y cieran en orden y de forma correcta.
 * - Paréntesis, llaves y corchetes son igual de prioritarios. No hay uno más importante que otro.
 * - Expresión balanceada: { [ a * ( c + d ) ] - 5 }
 * - Expresión no balanceada: { a * ( c + d ) ] - 5 }
 */

fun main() {
   println(isBalanced("{ [ a * ( c + d ) ] - 5 }"))
   println(isBalanced("{ a * ( c + d ) ] - 5 }"))
}

private fun isBalanced(input: String): Boolean {
    val symbols = mapOf("{" to "}", "(" to ")", "[" to "]")
    val stack = arrayListOf<String>()
    
    input.forEach {
        val symbol = it.toString()
        val containsKey = symbols.containsKey(symbol)
        
        if (containsKey || symbols.containsValue(symbol)) {
            if (containsKey) {
                stack.add(symbol)
            } else if (stack.isEmpty() || symbol != symbols[stack.removeLast()]) {
             	return false;   
            }
        }
    }
    
    return stack.isEmpty()
}