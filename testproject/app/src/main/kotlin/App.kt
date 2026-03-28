package org.milkyway.app

import org.milkyway.feature.EmojiMaker
import org.milkyway.service.BarbarianService

fun main() {
    val maker = EmojiMaker()
    val barbService = BarbarianService()
    val hihihiha = maker.makeHihiHaha(5)
    val barbaians = barbService.getAllBarbs()
    for (barb in barbaians) {
        barb.emitSound(hihihiha)
    }
}
