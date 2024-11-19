package com.codepath.bitlife

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.codepath.bitlife.data.WaterIntakeEntity


@Database(entities = [WaterIntakeEntity::class], version = 2)
@TypeConverters(Converters::class)

abstract class AppDatabase : RoomDatabase() {
    abstract fun waterIntakeDao(): WaterIntakeDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: buildDatabase(context).also { INSTANCE = it }
            }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java, "WaterIntake-db"
            )
                .fallbackToDestructiveMigration()
                .build()
    }
}
