package test.android.orca.com.roomvvm.utils;

import android.os.AsyncTask;
import android.support.annotation.NonNull;

import test.android.orca.com.roomvvm.database.AppDatabase;

public class DataBaseUtils {

    static final String TAG = DataBaseUtils.class.getName() ;

    public static void populateAsync(@NonNull final AppDatabase db){
        PopulateDbAsync task = new PopulateDbAsync(db);
        task.execute();
    }

    private static void populateWithTestData(AppDatabase db) {
       /* User user = new User();
        user.setFirstName("Ajay");
        user.setLastName("Saini");
        user.setAge(25);
        addUser(db, user);

        List<User> userList = db.userDao().getAll();
        Log.d(DatabaseInitializer.TAG, "Rows Count: " + userList.size());*/
    }
    public static void populateSync(@NonNull final AppDatabase db) {
        populateWithTestData(db);
    }
    private static class PopulateDbAsync extends AsyncTask<Void, Void, Void> {

        private final AppDatabase mDb;

        PopulateDbAsync(AppDatabase db) {
            mDb = db;
        }

        @Override
        protected Void doInBackground(final Void... params) {
            populateWithTestData(mDb);
            return null;
        }

    }
}
