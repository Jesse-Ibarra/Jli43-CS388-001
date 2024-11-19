package com.codepath.bitlife;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.codepath.bitlife.data.WaterIntakeEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class WaterIntakeDao_Impl implements WaterIntakeDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<WaterIntakeEntity> __insertionAdapterOfWaterIntakeEntity;

  private final Converters __converters = new Converters();

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllEntries;

  public WaterIntakeDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWaterIntakeEntity = new EntityInsertionAdapter<WaterIntakeEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `water_intake_table` (`id`,`date`,`amount`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WaterIntakeEntity value) {
        stmt.bindLong(1, value.getId());
        final Long _tmp = __converters.dateToTimestamp(value.getDate());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, _tmp);
        }
        stmt.bindLong(3, value.getAmount());
      }
    };
    this.__preparedStmtOfDeleteAllEntries = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM water_intake_table";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(final List<WaterIntakeEntity> entries) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfWaterIntakeEntity.insert(entries);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllEntries() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllEntries.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllEntries.release(_stmt);
    }
  }

  @Override
  public Flow<List<WaterIntakeEntity>> getAllEntries() {
    final String _sql = "SELECT * FROM water_intake_table ORDER BY date DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"water_intake_table"}, new Callable<List<WaterIntakeEntity>>() {
      @Override
      public List<WaterIntakeEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
          final List<WaterIntakeEntity> _result = new ArrayList<WaterIntakeEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final WaterIntakeEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final Date _tmpDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = __converters.fromTimestamp(_tmp);
            final int _tmpAmount;
            _tmpAmount = _cursor.getInt(_cursorIndexOfAmount);
            _item = new WaterIntakeEntity(_tmpId,_tmpDate,_tmpAmount);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
