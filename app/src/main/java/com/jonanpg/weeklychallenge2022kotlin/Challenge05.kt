package com.jonanpg.weeklychallenge2022kotlin

import android.graphics.BitmapFactory
import java.net.URL

/**
 * Created by JonanPG by Jon Ander Perez on 01/08/2022.
 * www.jonanpg.com
 *
 * Reto #5
 * ASPECT RATIO DE UNA IMAGEN
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Crea un programa que se encargue de calcular el aspect ratio de una imagen a partir de una url.
 * - Nota: Esta prueba no se puede resolver con el playground online de Kotlin. Se necesita Android Studio.
 * - Url de ejemplo: https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png
 * - Por ratio hacemos referencia por ejemplo a los "16:9" de una imagen de 1920*1080px.
 */

class Challenge05 {

    fun aspectRatio(url: String) {

        //Iniciamos un hilo
        Thread {
            var aspectRatioStr: String? = null

            //Recuperamos la imagen y la convertimos en Bitmap
            val url = URL(url)
            val bitMap = BitmapFactory.decodeStream(url.openStream())

            //Recuperamos la altura y el ancho
            val height = bitMap.height
            val width = bitMap.width

            //Calculamos el maximo comun divisor
            val factor = calcularFactor(width, height)
            aspectRatioStr = "${width/factor}:${height/factor}"

            aspectRatioStr?.let { ratio ->
                println("El aspect ratio es ${ratio}")
            } ?: run {
                println("No se ha podido calcular es aspect ratio")
            }
        }.start()
    }

    private fun calcularFactor(width: Int, height: Int): Int {
        if (height == 0) return width
        return calcularFactor(height, width % height)
    }
}