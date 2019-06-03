package test.android.orca.com.roomvvm.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import test.android.orca.com.roomvvm.model.User;

@Dao
public interface UserDAO {

    @Query("SELECT * from user")
    List<User> getAll() ;

    @Query("SELECT * from user where email like :email")
    User findByEmail(String email);

    @Query("Select count(*) from user")
    int countUsers() ;

    @Insert
    void InsertAll(User... users);

    @Delete
    void delete(User user) ;
}
