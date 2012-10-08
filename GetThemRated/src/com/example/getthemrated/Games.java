package com.example.getthemrated;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Games extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_games, menu);
        return true;
    }
}
