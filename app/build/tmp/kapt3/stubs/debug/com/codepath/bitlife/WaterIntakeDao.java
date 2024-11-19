package com.codepath.bitlife;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\'J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\'\u00a8\u0006\n"}, d2 = {"Lcom/codepath/bitlife/WaterIntakeDao;", "", "deleteAllEntries", "", "getAllEntries", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/codepath/bitlife/data/WaterIntakeEntity;", "insertAll", "entries", "app_debug"})
@androidx.room.Dao
public abstract interface WaterIntakeDao {
    
    @androidx.room.Query(value = "SELECT * FROM water_intake_table ORDER BY date DESC")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.codepath.bitlife.data.WaterIntakeEntity>> getAllEntries();
    
    @androidx.room.Insert
    public abstract void insertAll(@org.jetbrains.annotations.NotNull
    java.util.List<com.codepath.bitlife.data.WaterIntakeEntity> entries);
    
    @androidx.room.Query(value = "DELETE FROM water_intake_table")
    public abstract void deleteAllEntries();
}