package com.example.android.buttontouch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void some(View view) {
        TextView changeText = (TextView) findViewById(R.id.text);
        changeText.setText("my awesome text");
    }

}



