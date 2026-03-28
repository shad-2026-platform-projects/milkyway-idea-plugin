package org.milkyway.feature

import org.milkyway.integration.Max

class EmojiMaker {
    var max: Max

    constructor() {
        max = Max()
        max.observeCamera()
    }

    fun makeHihiHaha(len: Int): String {
        return "hihihiha".repeat(len)
    }
}