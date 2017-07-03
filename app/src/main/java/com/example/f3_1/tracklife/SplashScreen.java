package com.example.f3_1.tracklife;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by F3-1 on 09-Jun-17.
 */

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);


        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                    Intent intent = new Intent(SplashScreen.this,HomeActivity.class);
                    startActivity(intent);

                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{

                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();

    }

}



