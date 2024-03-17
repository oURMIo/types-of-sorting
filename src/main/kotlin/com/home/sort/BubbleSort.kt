package com.home.sort

import kotlin.random.Random

private fun bubbleSort(array: IntArray) {
    val n = array.size
    var swapped: Boolean
    do {
        swapped = false
        for (i in 1 until n) {
            if (array[i - 1] > array[i]) {
                val temp = array[i - 1]
                array[i - 1] = array[i]
                array[i] = temp
                swapped = true
            }
        }
    } while (swapped)
}

fun main() {
    val array = IntArray(10) { Random.nextInt(0, 101) }
    println("Array before: ${array.joinToString()}")
    bubbleSort(array)
    println("Array after: ${array.joinToString()}")
}
