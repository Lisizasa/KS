package org.example

fun main() {
    val step: String = "D2-D4;0"
    val from: String = step.slice(0..1)
    val goal: String = step.slice(3..4)
    val number: String = step.slice(6..(step.length-1))

    println(from)
    println(goal)
    println(number)

}