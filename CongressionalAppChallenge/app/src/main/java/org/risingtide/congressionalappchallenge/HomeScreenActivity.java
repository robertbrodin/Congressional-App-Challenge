package org.risingtide.congressionalappchallenge;

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

                }
                drawerLayout.closeDrawers();

                Log.d("TITLE 1", item.getTitle().toString());

                return true;
            }
        });

    }

    // Remember to add new activity to the ANDROID MANIFEST!!!
    public void testButtonClick(View View)
    {
        int clickedButtonID = ((Button)View).getId();
        Log.d("t", Integer.toString(clickedButtonID));
        String button_text = ((Button)View).getText().toString(); // filler for now

        // It is a lot more difficult to use IDs than text name.
        if(button_text.equals("Candidates")) {
            // If the button matches the target button, it sets the desired screen to the testActivity
            // Then starts that activity.
            Intent buttonClick = new Intent(this,candidatesActivity.class);
            startActivity(buttonClick);
        }
        else if(button_text.equals("Home Button") || button_text.equals("Home")){
            Intent buttonClick = new Intent(this,HomeScreenActivity.class);
            startActivity(buttonClick);

        }
        else if(button_text.equals("Register")){
            Intent buttonClick = new Intent(this,registerToVote.class);
            startActivity(buttonClick);

        }
        else if(button_text.equals("Centers")){
            Intent buttonClick = new Intent(this,centersActivity.class);
            startActivity(buttonClick);

        }
        else if(button_text.equals("Quiz")){
            Intent buttonClick = new Intent(this,quizActivity.class);
            startActivity(buttonClick);

        }
        else if(button_text.equals("Test")){
            Intent buttonClick = new Intent(this,testActivity.class);
            startActivity(buttonClick);

        }
    }
}