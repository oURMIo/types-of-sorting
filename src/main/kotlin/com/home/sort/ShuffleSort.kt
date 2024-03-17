package com.home.sort

import kotlin.random.Random

private fun shuffleSort(arr: IntArray): IntArray {
    val random = Random.Default
    var isSorted = false

    while (!isSorted) {
        for (i in arr.indices) {
            val randomIndex = random.nextInt(0, arr.size)
            arr.swap(i, randomIndex)
        }

        isSorted = true
        for (i in 0 until arr.size - 1) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false
                break
            }
        }
    }

    return arr
}

private fun IntArray.swap(i: Int, j: Int) {
    val temp = this[i]
    this[i] = this[j]
    this[j] = temp
}

fun main() {
    val array = IntArray(10) { Random.nextInt(0, 101) }
    println("Array before: ${array.joinToString()}")
    shuffleSort(array)
    println("Array after: ${array.joinToString()}")
}