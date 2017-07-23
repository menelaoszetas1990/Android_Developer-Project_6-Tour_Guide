package com.example.menelaos.tourguidexanthi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the first_activity.xml layout file
        setContentView(R.layout.intro_activity);

        // Find the View that shows the image from the first page of the application
        LinearLayout introScreen = (LinearLayout) findViewById(R.id.intro_screen);

        // Set a click listener on that View
        introScreen.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            // Create a new intent to open the MainActivity
            public void onClick(View view) {
                // Start the MainActivity
                Intent goToMainActivity = new Intent(IntroActivity.this, MainActivity.class);
                startActivity(goToMainActivity);
            }
        });
    }
}