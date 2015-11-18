package com.candeapps.connectfour;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by mcberliner on 11/17/2015.
 */
public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void letsPlay(View view) {
        Intent intent = new Intent(this, GamePlay.class);
        startActivity(intent);
    }
}
