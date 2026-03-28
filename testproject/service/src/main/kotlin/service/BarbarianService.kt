package org.milkyway.service

import org.milkyway.model.Barbarian

class BarbarianService {
    fun getAllBarbs(): List<Barbarian> {
        return listOf(
            Barbarian("Kirill", 10, 100),
            Barbarian("Lenia)", 5, 30),
            Barbarian("Viktor", 9, 70),
            Barbarian("Igor", 8, 85),
            Barbarian("Nikita", 5, 15)
        )
    }
}