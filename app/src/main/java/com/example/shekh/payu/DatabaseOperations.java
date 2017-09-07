package com.example.shekh.payu;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.math.BigInteger;

/**
 * Created by shekh on 07-Sep-17.
 */

public class DatabaseOperations extends SQLiteOpenHelper {
    public static final int database_version =1;
    public String CREATE_QUERY = "CREATE TABLE "+ CardData.CardInfo.TABLE_NAME+"("+ CardData.CardInfo.CARD_NO+" INTEGER,"+ CardData.CardInfo.CARD_EXP+" INTEGER,"+
            CardData.CardInfo.CARD_TYPE+" TEXT,"+ CardData.CardInfo.CARD_MODE+" TEXT,"+ CardData.CardInfo.CARD_CATEGORY+" TEXT,"+ CardData.CardInfo.STATUS+" TEXT,"+
            CardData.CardInfo.AMOUNT+" INTEGER );";

    public DatabaseOperations(Context context) {
        super(context, CardData.CardInfo.DATABASE_NAME, null,database_version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_QUERY);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void storeInformation (DatabaseOperations dop, String card_no,
                                  String card_exp, String card_type,String card_mode,String card_category,String status,String amount)

    {

        SQLiteDatabase SQ = dop.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(CardData.CardInfo.CARD_NO,card_no);
        cv.put(CardData.CardInfo.CARD_EXP,card_exp);
        cv.put(CardData.CardInfo.CARD_TYPE,card_type);
        cv.put(CardData.CardInfo.CARD_MODE,card_mode);
        cv.put(CardData.CardInfo.CARD_CATEGORY,card_category);
        cv.put(CardData.CardInfo.STATUS,status);
        cv.put(CardData.CardInfo.AMOUNT,amount);
        long k = SQ.insert(CardData.CardInfo.TABLE_NAME,null,cv);


    }
}
