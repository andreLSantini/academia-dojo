package com.santini.academiadojofightclube;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;

import android.os.Bundle;

public class splah extends Activity implements Runnable {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splah);

        Handler handler = new Handler();
        handler.postDelayed(this, 3000);
    }

    public void run(){
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
