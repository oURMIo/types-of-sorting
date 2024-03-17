package com.home.sort

import kotlin.random.Random

private fun combSort(arr: IntArray) {
    var gap = arr.size
    var swapped = true

    while (gap > 1 || swapped) {
        if (gap > 1) {
            gap = (gap / 1.3).toInt()
        }

        swapped = false
        var i = 0

        while (i + gap < arr.size) {
            if (arr[i] > arr[i + gap]) {
                val temp = arr[i]
                arr[i] = arr[i + gap]
                arr[i + gap] = temp
                swapped = true
            }
            i++
        }
    }
}

fun main() {
    val array = IntArray(10) { Random.nextInt(0, 101) }
    println("Array before: ${array.joinToString()}")
    combSort(array)
    println("Array after: ${array.joinToString()}")
}
