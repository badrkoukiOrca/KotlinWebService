package test.android.orca.com.roomvvm.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import test.android.orca.com.roomvvm.R;
import test.android.orca.com.roomvvm.databinding.ActivityMainBinding;
import test.android.orca.com.roomvvm.viewmodel.InscriptionUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        InscriptionUtil inscriptionUtil = new InscriptionUtil() ;
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main) ;
        activityMainBinding.setInscription(inscriptionUtil);
        activityMainBinding.executePendingBindings();
    }



}
