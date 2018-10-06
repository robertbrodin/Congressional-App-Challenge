package org.risingtide.congressionalappchallenge;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.support.v4.widget.DrawerLayout;

import java.net.URL;


public class HomeScreenActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);


        drawerLayout = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.navview_home);
        // Event listener is used to check when a nav item is clicked.
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                item.setChecked(true);
                Intent i;

                switch(item.getItemId()){
                    case(R.id.nav_home):
                        // Changes the activity to the home screen.
                        i = new Intent(getBaseContext(), HomeScreenActivity.class);
                        startActivity(i);
                        item.setChecked(false);
                        break;
                    case(R.id.nav_register):
                        // Changes the activity to the register to vote activity.
                        i = new Intent(getBaseContext(), registerToVote.class);
                        startActivity(i);
                        item.setChecked(false);
                        break;
                    case(R.id.nav_candidates):
                        i = new Intent(getBaseContext(), candidatesActivity.class);
                        startActivity(i);
                        item.setChecked(false);
                        break;
                    case(R.id.nav_mission):
                        i = new Intent(getBaseContext(), missionActivity.class);
                        startActivity(i);
                        item.setChecked(false);
                        break;

                }
                drawerLayout.closeDrawers();

                Log.d("TITLE 1", item.getTitle().toString());

                return true;
            }
        });

    }

    // Remember to add new activity to the ANDROID MANIFEST!!!
    public void onHomeButtonClick(View View)
    {
        // It is a lot more difficult to use IDs than text name.
        Intent buttonClick;
        Log.d("View ID", Integer.toString(View.getId()));

        // Using switch statement to start activity based off of button ID.
        switch(View.getId()) {
            case (R.id.register_button):
                buttonClick = new Intent(this, registerToVote.class);
                startActivity(buttonClick);
                break;
            case (R.id.candidates_button):
                buttonClick = new Intent(this, candidatesActivity.class);
                startActivity(buttonClick);
                break;
            case(R.id.quiz_button):
                buttonClick = new Intent(this, quizActivity.class);
                startActivity(buttonClick);
                break;
            case(R.id.home_button):
                buttonClick = new Intent(this, HomeScreenActivity.class);
                startActivity(buttonClick);
                break;
            case(R.id.link_to_web):
                // Sends user to the website
                Intent myIntent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://www.sec.state.ma.us/ovr/"));
                startActivity(myIntent);
        }
    }

}