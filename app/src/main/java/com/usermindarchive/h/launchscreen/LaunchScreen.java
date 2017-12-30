package com.usermindarchive.h.launchscreen;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class LaunchScreen extends AppCompatActivity {


//TODO: Create the Launch Screen Activity

//    This Activity will be responsible for the Launch Screen to appear
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        Time for the Launch Screen to be visible
        int delayTime=3000;


//This is option as the Launch screen will be appearing few millseconds

//User to see logo for a particular set of time
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

//                This will launch the Main Activity and code runs as usual

                Intent launch= new Intent(LaunchScreen.this,MainActivity.class);
                startActivity(launch);
                finish();


            }
        }, delayTime);

    


    }
}
