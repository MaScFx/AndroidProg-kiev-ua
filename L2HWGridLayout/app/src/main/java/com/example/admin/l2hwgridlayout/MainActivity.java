package com.example.admin.l2hwgridlayout;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonAPP;
    ImageButton buttonDial;
    ImageButton buttonSMS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        buttonAPP = (Button) findViewById(R.id.buttonAPP);
        buttonDial = (ImageButton) findViewById(R.id.buttonDial);
        buttonSMS = (ImageButton) findViewById(R.id.buttonSMS);
        buttonAPP.setOnClickListener(this);
        buttonDial.setOnClickListener(this);
        buttonSMS.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.buttonAPP:
                intent = new Intent(this, ActivityAPP.class);
                startActivity(intent);
                break;
            case R.id.buttonDial:
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:") );
                startActivity(intent);
                break;
            case R.id.buttonSMS:
                intent= new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", "123456", null));
                startActivity(intent);
            default:
                break;
        }


    }
}
