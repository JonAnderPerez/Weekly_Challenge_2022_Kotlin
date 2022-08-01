package com.jonanpg.weeklychallenge2022kotlin

/**
 * Created by JonanPG by Jon Ander Perez on 01/08/2022.
 * www.jonanpg.com
 *
 * Reto #4
 * ÁREA DE UN POLÍGONO
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */

fun main() {
    calcularAreaPoligono(Triangulo(10.0, 5.0))
    calcularAreaPoligono(Rectangulo(10.0, 5.0))
    calcularAreaPoligono(Cuadrado(5.0))
}

interface Poligono {
    fun area(): Double
    fun mostarArea()
}

data class Triangulo(val base: Double, val altura: Double): Poligono {
    override fun area(): Double {
        return (base * altura) / 2
    }

    override fun mostarArea() {
        println("El area del triangulo es ${area()}")
    }
}

data class Rectangulo(val ancho: Double, val altura: Double): Poligono {
    override fun area(): Double {
        return (ancho * altura)
    }

    override fun mostarArea() {
        println("El area del rectangulo es ${area()}")
    }
}

data class Cuadrado(val lado: Double): Poligono {
    override fun area(): Double {
        return lado * lado
    }

    override fun mostarArea() {
        println("El area del rectangulo es ${area()}")
    }
}

fun calcularAreaPoligono(poligono: Poligono): Double {
    poligono.mostarArea()
    return poligono.area()
}