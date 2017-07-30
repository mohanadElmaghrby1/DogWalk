package android.example.com.dogwalk.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.example.com.dogwalk.data.DogContract.DogEntry;

/**
 * Created by mohanad on 30/07/17.
 */

public class DogDbHelper extends SQLiteOpenHelper {

    private static final  String DATABASE_NAME = "habit.db";
    private static final int DATABASE_VERSION = 1;

    public DogDbHelper(Context context) {

        super(context, DATABASE_NAME , null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create a String that contains the SQL statement to create the pets table
        String SQL_CREATE_PETS_TABLE =  "CREATE TABLE " + DogEntry.TABLE_NAME + " ("
                + DogEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + DogEntry.COLUMN_DOG_NAME + " TEXT NOT NULL, "
                + DogEntry.COLUMN_WALKING_HOURS + " INTEGER NOT NULL ); ";
        db.execSQL(SQL_CREATE_PETS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
