package ua.kiev.prog.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import ua.kiev.prog.myapplication.http.Http;
import ua.kiev.prog.myapplication.http.IHttp;
import ua.kiev.prog.myapplication.model.GeoIP;

public class MainActivity extends BaseActivity {

    private IHttp http;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = (TextView) findViewById(R.id.text);
        http = getHttp();

        http.getDataFromServer(new Http.Callback<GeoIP>() {
            @Override
            public void onData(GeoIP geoIP) {
                textView.setText("Your city is: " + geoIP.getCity());
            }
        });
    }
}
