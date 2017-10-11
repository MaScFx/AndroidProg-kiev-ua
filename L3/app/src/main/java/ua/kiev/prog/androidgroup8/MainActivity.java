package ua.kiev.prog.androidgroup8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String a;
    String b;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.text);
textView.setText("vsfjvgsjfhvsjfhvjhsfv");
        int a = 1;
        int b = a++;
        b = 2;
    }
}
