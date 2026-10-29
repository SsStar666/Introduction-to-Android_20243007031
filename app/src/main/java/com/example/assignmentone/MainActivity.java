package com.example.assignmentone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * MainActivity - the home screen of the CampusLife app.
 *
 * Each ImageButton has its own onClick method (Part E) which shows a
 * Toast, and then launches the DetailActivity (Part G) passing a unique
 * index (0-3) that DetailActivity uses to look up the correct content.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Facilities button - Part E & G */
    public void onFacilitiesClick(View view) {
        Toast.makeText(this, "Facilities clicked", Toast.LENGTH_SHORT).show();
        openDetail(0, "Facilities");
    }

    /** Events button - Part E & G */
    public void onEventsClick(View view) {
        Toast.makeText(this, "Events clicked", Toast.LENGTH_SHORT).show();
        openDetail(1, "Events");
    }

    /** Clubs button - Part E & G */
    public void onClubsClick(View view) {
        Toast.makeText(this, "Clubs clicked", Toast.LENGTH_SHORT).show();
        openDetail(2, "Clubs");
    }

    /** Support button - Part E & G */
    public void onSupportClick(View view) {
        Toast.makeText(this, "Support clicked", Toast.LENGTH_SHORT).show();
        openDetail(3, "Support");
    }

    /**
     * Builds an explicit Intent to start DetailActivity.
     * "index" is the unique identifier used to pick the matching content
     * from arrays.xml. "section_title" is the title shown on the banner.
     */
    private void openDetail(int index, String title) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("index", index);
        intent.putExtra("section_title", title);
        startActivity(intent);
    }
}
