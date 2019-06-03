package test.android.orca.com.roomvvm.database;

import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import test.android.orca.com.roomvvm.DAO.UserDAO;

public abstract class AppDatabase extends RoomDatabase {

    private  static  AppDatabase INSTANCE ;
    public abstract UserDAO userDAO() ;

    public static AppDatabase getAppDatabase(Context context){

        if (INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),AppDatabase.class,"user-database").allowMainThreadQueries().build();
        }
        return  INSTANCE ;
    }

    public static  void DestroyInstance(){
        INSTANCE = null ;
    }
}
