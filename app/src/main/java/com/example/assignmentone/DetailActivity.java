package com.example.assignmentone;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * DetailActivity - shows detailed information about one of the four
 * student service areas (Facilities / Events / Clubs / Support).
 *
 * In onCreate() it reads the "index" passed by MainActivity and uses it
 * to pull the matching title, content and image name from the three
 * parallel arrays in arrays.xml. No if/switch statements are used - the
 * index simply indexes into the arrays.
 */
public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // The three parallel arrays stored in res/values/arrays.xml
        String[] titles = getResources().getStringArray(R.array.string_array_titles);
        String[] contents = getResources().getStringArray(R.array.string_array_content);
        String[] imageNames = getResources().getStringArray(R.array.string_array_images);

        // Unique identifier received from MainActivity (0 = Facilities, 1 = Events,
        // 2 = Clubs, 3 = Support). All four arrays are ordered the same way.
        int index = getIntent().getIntExtra("index", 0);

        // Grab references to the views we need to fill in
        TextView sectionTitleView = findViewById(R.id.detail_section_title);
        TextView titleView = findViewById(R.id.detail_title);
        TextView contentView = findViewById(R.id.detail_content);
        ImageView iconView = findViewById(R.id.detail_icon);

        // Populate the screen with the matching dummy data
        sectionTitleView.setText(getIntent().getStringExtra("section_title"));
        titleView.setText(titles[index]);
        contentView.setText(contents[index]);

        // Resolve the image file name from arrays.xml to a drawable resource id
        int imageResId = getResources().getIdentifier(
                imageNames[index], "drawable", getPackageName());
        iconView.setImageResource(imageResId);
    }
}
