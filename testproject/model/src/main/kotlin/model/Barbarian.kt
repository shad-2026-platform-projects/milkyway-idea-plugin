package org.milkyway.model

data class Barbarian(val name: String, val lvl: Int, var hp: Int) {
    fun emitSound(monolog: String) {
        println("${name}: $monolog")
    }
}