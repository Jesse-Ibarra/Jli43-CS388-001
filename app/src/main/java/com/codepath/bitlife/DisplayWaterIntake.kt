package com.codepath.bitlife.data

import java.io.Serializable
import java.util.Date

data class DisplayWaterIntake(
    val date: Date,
    val amount: Int
) : Serializable
