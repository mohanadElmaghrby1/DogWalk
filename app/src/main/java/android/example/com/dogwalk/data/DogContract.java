package android.example.com.dogwalk.data;

import android.provider.BaseColumns;

/**
 * Created by mohanad on 30/07/17.
 */

public final class DogContract  {

    public static final class DogEntry implements BaseColumns{

        //the table name
        public static final String TABLE_NAME="dog_walk";

        //the dog id cloumn
        public static final String _ID=BaseColumns._ID;

        //the dog name column
        public static final String COLUMN_DOG_NAME="dog_name";

        //the dog walking hours per day
        public static final String COLUMN_WALKING_HOURS="walking_hours";

    }
}