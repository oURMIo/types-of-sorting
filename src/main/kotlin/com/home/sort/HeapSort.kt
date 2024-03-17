package com.home.sort

import kotlin.random.Random

private fun heapSort(arr: IntArray) {
    val n = arr.size

    for (i in n / 2 - 1 downTo 0) {
        heapify(arr, n, i)
    }

    for (i in n - 1 downTo 0) {
        val temp = arr[0]
        arr[0] = arr[i]
        arr[i] = temp

        heapify(arr, i, 0)
    }
}

private fun heapify(arr: IntArray, n: Int, i: Int) {
    var largest = i
    val left = 2 * i + 1
    val right = 2 * i + 2

    if (left < n && arr[left] > arr[largest]) {
        largest = left
    }

    if (right < n && arr[right] > arr[largest]) {
        largest = right
    }

    if (largest != i) {
        val swap = arr[i]
        arr[i] = arr[largest]
        arr[largest] = swap

        heapify(arr, n, largest)
    }
}

fun main() {
    val array = IntArray(10) { Random.nextInt(0, 101) }
    println("Array before: ${array.joinToString()}")
    heapSort(array)
    println("Array after: ${array.joinToString()}")
}
