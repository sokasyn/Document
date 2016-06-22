package com.emin.digit.mobile.android.learning.practiceproject.Model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Samson on 16/6/22.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String TAG = DatabaseHelper.class.getSimpleName();

    private static final int INIT_DB_VERSION = 1;
    private static final String DEFAULT_DB_NAME="fish_1.db";

    //三个不同参数的构造函数
    //带全部参数的构造函数，此构造函数必不可少
    public DatabaseHelper(Context context, String name, CursorFactory factory, int version) {
        super(context, name, factory, version);
        Log.i(TAG,"Constructor four params");
    }

    //带三个参数的构造函数，调用的是带所有参数的构造函数
    public DatabaseHelper(Context context,String name,int version){
        this(context, name, null, version);
        Log.i(TAG,"Constructor three params");
    }

    //带两个参数的构造函数，调用的其实是带三个参数的构造函数
    public DatabaseHelper(Context context,String name){
        this(context, name, INIT_DB_VERSION);
        Log.i(TAG,"Constructor two params");
    }

    //创建数据库
    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i(TAG,"DatabaseHelper onCreate");
        //创建数据库sql语句
        String sql = "create table user(id int,name varchar(20))";
        //执行创建数据库操作
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //创建成功，日志输出提示
        Log.i(TAG,"DatabaseHelper onUpgrade");
    }
}
