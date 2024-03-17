package com.home.sort

import kotlin.random.Random

private fun mergeSort(arr: IntArray) {
    if (arr.size < 2) return

    val middle = arr.size / 2
    val left = arr.copyOfRange(0, middle)
    val right = arr.copyOfRange(middle, arr.size)

    mergeSort(left)
    mergeSort(right)

    merge(left, right, arr)
}

private fun merge(left: IntArray, right: IntArray, arr: IntArray) {
    var i = 0
    var j = 0
    var k = 0

    while (i < left.size && j < right.size) {
        if (left[i] <= right[j]) {
            arr[k++] = left[i++]
        } else {
            arr[k++] = right[j++]
        }
    }

    while (i < left.size) {
        arr[k++] = left[i++]
    }

    while (j < right.size) {
        arr[k++] = right[j++]
    }
}

fun main() {
    val array = IntArray(10) { Random.nextInt(0, 101) }
    println("Array before: ${array.joinToString()}")
    mergeSort(array)
    println("Array after: ${array.joinToString()}")
}
