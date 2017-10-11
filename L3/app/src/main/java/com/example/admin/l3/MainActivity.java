package com.example.admin.l3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.admin.l3.http.Http;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Http http = new Http();

        Http.getInstance().getdatafs(new Http.allback()) {
            @Override
            public void onData(String str) {
                System.out.println("111");
                Log.i("MainActivity","some data");
            }
        });



    }





}
