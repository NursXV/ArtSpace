package com.example.tiptime

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTests {

    @Test
    fun calculateTip_20PercentNoRoundup() {
        val expectedTip = NumberFormat.getCurrencyInstance().format(2.0)

        val actualTip = calculateTip(
            amount = 10.0,
            tipPercent = 20.0,
            roundUp = false
        )

        assertEquals(expectedTip, actualTip)
    }

    @Test
    fun calculateTip_15PercentRoundup() {
        val expectedTip = NumberFormat.getCurrencyInstance().format(2.0)

        val actualTip = calculateTip(
            amount = 10.0,
            tipPercent = 15.0,
            roundUp = true
        )

        assertEquals(expectedTip, actualTip)
    }
}