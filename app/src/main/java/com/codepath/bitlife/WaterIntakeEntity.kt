package com.codepath.bitlife.data
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "water_intake_table")
data class WaterIntakeEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val date: Date = Date(),
    val amount: Int
)