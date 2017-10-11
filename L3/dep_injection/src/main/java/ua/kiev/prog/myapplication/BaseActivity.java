package ua.kiev.prog.myapplication;

import android.support.v7.app.AppCompatActivity;

import ua.kiev.prog.myapplication.http.Http;
import ua.kiev.prog.myapplication.http.IHttp;

public class BaseActivity extends AppCompatActivity {

    protected IHttp getHttp() {
        return new Http();
    }
}
