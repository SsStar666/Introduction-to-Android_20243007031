package com.example.assignmentone;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/**
 * DetailActivity - shows detailed information about one of the four
 * student service areas (Facilities / Events / Clubs / Support).
 */
public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }
}
