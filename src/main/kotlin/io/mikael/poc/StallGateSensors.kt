package io.mikael.poc

import org.springframework.stereotype.Service

/**
 * A business component representing a set of stall gate sensors,
 * which pick up information on which horses enter or exit stalls
 * at what time.
 */
@Service
class StallGateSensors {

    fun horseEnteredStall(horse: Horse, stall: Long) {
    }

    fun horseExitedStall(horse: Horse, stall: Long) {
    }

}
