package Solution.wildhack;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import Models.CustomerModel;

public class DatabaseHelper extends SQLiteOpenHelper  {


    public static final String CUSTOMER_TABLE = "CUSTOMER_TABLE";
    public static final String CUSTOMER_NAME = "CUSTOMER_NAME";
    public static final String CUSTOMER_AGE = "CUSTOMER_AGE";
    public static final String ACTIVE_CUSTOMER = "ACTIVE_CUSTOMER";
    public static final String ID = "ID";

    public DatabaseHelper(@Nullable Context context) {
        super(context, "customer.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableStatement = "CREATE TABLE " + CUSTOMER_TABLE + " (" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + CUSTOMER_NAME + " TEXT , " + CUSTOMER_AGE + " INT , " + ACTIVE_CUSTOMER + " BOOL )";

        db.execSQL(createTableStatement);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public boolean AddOne (CustomerModel customerModel){

        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put( CUSTOMER_NAME , customerModel.getName());
        cv.put(CUSTOMER_AGE, customerModel.getAge());
        cv.put(ACTIVE_CUSTOMER, customerModel.getActive());

        long insert = database.insert(CUSTOMER_TABLE, null, cv);

        Log.i("SQL", String.valueOf(customerModel.getName()));
        if (insert==-1){
            return false;
        } else {
            return true;
        }


    }

    public boolean deleteOne(CustomerModel customerModel){
        SQLiteDatabase db = this.getWritableDatabase();
//         String query = "DELETE FROM "+CUSTOMER_TABLE + " WHERE " +  ID + " = " + customerModel.getID() ;
//        Cursor cursor = db.rawQuery(query, null);
//        if (cursor.moveToFirst()){
//            return true;
//        }else {
//            return false;
//        }
        ContentValues cv = new ContentValues();
        cv.put(ID, customerModel.getID());
        cv.put(CUSTOMER_NAME, "Abobus");
        int update = db.update(CUSTOMER_TABLE, cv, "ID = ?", new String[]{Integer.toString(customerModel.getID())});
        return (update)>0? true:false;
    }


    public List<CustomerModel> getEveryone(){
        List<CustomerModel> returnlist = new ArrayList<>();

        String query = "SELECT  * FROM " + CUSTOMER_TABLE;
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);
        if (cursor.moveToFirst()){
            do{
                int customerID = cursor.getInt(0);
                String customerName = cursor.getString(1);
                int customerAge = cursor.getInt(2);
                boolean isactive = cursor.getInt(3) == 1 ?  true: false ;

                CustomerModel customerModel = new CustomerModel(customerID,customerName, customerAge, isactive);
                returnlist.add(customerModel);


            } while (cursor.moveToNext() );



        } else {

        }
        cursor.close();
        db.close();

        return returnlist;
    }
}
