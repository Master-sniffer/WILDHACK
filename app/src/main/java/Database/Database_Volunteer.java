package Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;


public class Database_Volunteer extends SQLiteOpenHelper {

    public static final String TABLE = "VOLUNTEER";

    public static final String VOL_ID = "VOL_ID";
    public static final String VOL_NAME = "VOL_NAME";
    public static final String VOL_SURNAME = "VOL_SURNAME";
    public static final String VOL_MIDDLENAME = "VOL_MIDDLENAME";

    public static final String VOL_DATEOFBIRTH = "VOL_DATEOFBIRTH";
    public static final String VOL_EMAIL = "VOL_EMAIL";
    public static final String VOL_TELEPHONE = "VOL_TELEPHONE";

    public static final String VOL_SOCIALNETWORK = "VOL_SOCIALNETWORK";
    public static final String VOL_PLACE_WHERE_LIVES = "VOL_PLACE_WHERE_LIVES";

    public static final String VOL_EXPERIENCE = "VOL_EXPERIENCE";
    public static final String VOL_ACTIONS = "VOL_ACTIONS";

    public static final String VOL_FAR_AWAY = "VOL_FAR_AWAY";




    public Database_Volunteer(@Nullable Context context) {
        super(context, "VOLUNTEER.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableStatement = "CREATE TABLE " + TABLE + " (" + VOL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + VOL_NAME + " TEXT , " + VOL_SURNAME + " TEXT , " + VOL_MIDDLENAME + " TEXT , " + VOL_DATEOFBIRTH + " TEXT , " +
                  VOL_EMAIL + " TEXT , " + VOL_TELEPHONE + " TEXT , " + VOL_SOCIALNETWORK + " TEXT , " + VOL_PLACE_WHERE_LIVES + " TEXT , " + VOL_EXPERIENCE + " TEXT ,  " + VOL_ACTIONS + " TEXT , " + VOL_FAR_AWAY + " TEXT )";
        db.execSQL(createTableStatement);
    }
    // String createTableStatement = "CREATE TABLE " + CUSTOMER_TABLE + " (" + VOL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + CUSTOMER_NAME + " TEXT , " + CUSTOMER_AGE + " INT , " + ACTIVE_CUSTOMER + " BOOL )";


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    //public boolean InsertValues ()
}
