package com.jonanpg.weeklychallenge2022kotlin

/**
 * Created by JonanPG by Jon Ander Perez on 04/08/2022.
 * www.jonanpg.com
 *
 * Reto #7
 * CONTANDO PALABRAS
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que cuente cuantas veces se repite cada palabra y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que lo resuelvan automáticamente.
 * 
 * Aprendido: "Leccion aprendida a la hora de realizar el ejercicio o despues de comprobar otra solucion mejor"
 * - Mirando la solución de Mouredev he visto que se puede hacer mucho mas facil utilizando mutableMapOf<String, Int>()
 *   y comprobando la key extraida de la frase, en caso de estar la key sumar uno, sino añadir una nueva key
 */

fun main() {
    val frase: String = "Esta es 12 12 12 12 +-/-*/*- +-/*- -* -*    una prueba para el reto de programacion de mouredev. Esta frase tiene que tener palabras repetidas como (esta, mouredev, la, tiene, programacion)"
    println("La frase completa es \"$frase\"\n")
    mostrarPalabrasRepetidas(contarPalabrasRepetidas(frase))
}

private fun mostrarPalabrasRepetidas(lista: ArrayList<Pair<String, Int>>) {
    lista.asIterable().forEach({
        println("La palabra \"${it.first}\" se ha repetido ${it.second} veces.")
    })
}

private fun contarPalabrasRepetidas(frase: String): ArrayList<Pair<String, Int>> {
    var palabrasRepetidas: ArrayList<String> = arrayListOf<String>()

    //Eliminamos los simbolos y separamos las palabras por espacios	
    var regex = Regex("[^a-z0-9\\s]")
	var palabrasSueltas: List<String> = regex.replace(frase.toLowerCase(), "").split(" ")

	//Guardamos las palabras unicas en una lista
    palabrasSueltas.forEach({
        if (!palabrasRepetidas.contains(it) && "" != it) {
            palabrasRepetidas.add( it)
        }
    })
    
    var contadorPalabrasRepetidas: ArrayList<Pair<String, Int>> = arrayListOf<Pair<String, Int>>()
    
    //Recoremos la lista de palabras unicas y las buscamos en la lista de todas las palabras
    //Vamos sumando las veces que se encuentra cada palabra
    palabrasRepetidas.forEach({    
        var stringRepetido = it
        var numRepetido: Int = 0
        var contRepetido: Pair<String, Int> = Pair(stringRepetido, numRepetido)
        
        palabrasSueltas.forEach({
            if (stringRepetido == it) {
                contRepetido = contRepetido.copy(second = (contRepetido.second + 1))
            }
    	})
        
        contadorPalabrasRepetidas.add(contRepetido)
    })
    
    return contadorPalabrasRepetidas
}