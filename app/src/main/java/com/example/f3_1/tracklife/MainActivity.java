package com.example.f3_1.tracklife;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_user);
        Button button1=(Button)findViewById(R.id.btnadd);

        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Fingerprint.class);
//                i.putExtra("Value1", "Android By Javatpoint");
//                i.putExtra("Value2", "Simple Tutorial");
                // Set the request code to any code you like, you can identify the
                // callback via this code
                startActivity(i);
            }
        });
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
//        Intent intent = new Intent(Intent.ACTION_MAIN);
//        intent.addCategory(Intent.CATEGORY_HOME);
//        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);//***Change Here***
//        startActivity(intent);
//        finish();
//        System.exit(0);
    }
}
