package test.android.orca.com.roomvvm.viewmodel;

import android.databinding.BaseObservable;
import android.util.Log;

import test.android.orca.com.roomvvm.model.User;

public class InscriptionUtil  extends BaseObservable {

    public User user ;

    public  String fail_msg = "inscription echoué" ;
    public String succ_msg = "inscription approuvé" ;


    public String message = null ;

    public InscriptionUtil() {
        this.user = new User("","","") ;
    }

    public void OnMailChanged(CharSequence email){
        this.user.setEmail(email.toString());
    }

    public void OnPasswordChanged(CharSequence password){
        this.user.setPassword(password.toString());
    }

    public void OnNameChanged(CharSequence name){
        this.user.setName(name.toString());
    }


    public void OnButtonClick(){
        if(user.equals(new User("badr@gmail.com","123","badr"))){
            message = succ_msg ;
            //notifyPropertyChanged(BR.message);
            Log.i("Message",message) ;
        }
        else{
            message = fail_msg ;
            Log.i("Message",message) ;
        }
    }
}
