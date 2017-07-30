package android.example.com.dogwalk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.example.com.dogwalk.data.DogContract;
import android.example.com.dogwalk.data.DogDbHelper;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private DogDbHelper mDogDbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDogDbHelper=new DogDbHelper(this);

        insert();
        read();
    }

    /**
     * insert a row to data base
     */
    private void insert(){
        //create contentVAlues object
        ContentValues contentValues=new ContentValues();
        contentValues.put(DogContract.DogEntry.COLUMN_DOG_NAME,"Totti");
        contentValues.put(DogContract.DogEntry.COLUMN_WALKING_HOURS,2);
        //open connection
        SQLiteDatabase sqLiteDatabase=mDogDbHelper.getReadableDatabase();

        long result =sqLiteDatabase.insert(DogContract.DogEntry.TABLE_NAME , null ,contentValues);

        Log.v("Database Insert result",result+"");
    }

    private Cursor read (){
        // Create and/or open a database to read from it
        SQLiteDatabase db = mDogDbHelper.getReadableDatabase();
        //columns to return
        String [] projection ={DogContract.DogEntry.COLUMN_DOG_NAME , DogContract.DogEntry.COLUMN_WALKING_HOURS};
        Cursor cursor = db.query(DogContract.DogEntry.TABLE_NAME , null , null , null , null ,null,null);

        return cursor;
    }
}
