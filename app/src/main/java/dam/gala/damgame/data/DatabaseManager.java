package dam.gala.damgame.data;

import android.database.sqlite.SQLiteDatabase;

public class DatabaseManager {
    private SQLiteDatabase sqLiteDatabase;
        public DatabaseManager(DatabaseHelper databaseHelper){
            this.sqLiteDatabase = databaseHelper.getWritableDatabase();
        }
}
