package com.example.shekh.payu;

import android.provider.BaseColumns;

/**
 * Created by shekh on 07-Sep-17.
 */

public class CardData {

    public CardData()
    {

    }

    public static abstract class CardInfo implements BaseColumns
    {

        public static final String CARD_NO = "card_no";
        public static final String CARD_EXP = "card_exp";
        public static final String CARD_TYPE = "card_type";
        public static final String CARD_MODE = "card_mode";
        public static final String CARD_CATEGORY = "card_no";
        public static final String STATUS = "status";
        public static final String AMOUNT = "amount";
        public static final String DATABASE_NAME = "Data";
        public static final String TABLE_NAME = "Transaction_Details";


    }
}
