package com.home.sort

import kotlin.random.Random

private fun insertionSort(arr: IntArray) {
    val n = arr.size
    for (i in 1 until n) {
        val key = arr[i]
        var j = i - 1

        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j]
            j--
        }
        arr[j + 1] = key
    }
}

fun main() {
    val array = IntArray(10) { Random.nextInt(0, 101) }
    println("Array before: ${array.joinToString()}")
    insertionSort(array)
    println("Array after: ${array.joinToString()}")
}
