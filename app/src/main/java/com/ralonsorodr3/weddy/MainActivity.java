package com.ralonsorodr3.weddy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Intent intent = new Intent(this, com.ralonsorodr3.weddy.ChooserActivity.class);
        // startActivity(intent);
        // finish();
    }

    public void launchChooser(View view) {
        Intent intent = new Intent(this, ChooserActivity.class);
        startActivity(intent);
    }
}
