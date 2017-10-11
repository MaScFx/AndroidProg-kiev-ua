package com.example.admin.l3.http;

import com.example.admin.l3.MainActivity;

/**
 * Created by Admin on 10.10.2017.
 */

public class Http {
    private static Http http = new Http();

    public static Http getInstance() {
        return http;
    }

    private void getDataFromServ(Callback callback){
        callback.onData("Some string");
    }

    interface Callback{
        void onData(String str);
    }
}
