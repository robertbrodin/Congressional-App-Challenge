package org.risingtide.congressionalappchallenge;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

public class ballotQuestions extends AppCompatActivity {

    // Will be used to change the specific xml file the class loads. Will be changed under candidatesActivity -> specifically the onClickCandidate function.
    // Possible due to static functionality!
    public static int fileToLoad;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Was having an issue that Centers went to candidates instead, the whole time it was going to the wrong activity.

        setContentView(fileToLoad);


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


        // Need some way to make it more efficient.
        // IDEA: Can edit the entire page for specific candidates based off of values.
    }

    public void onBallotButtonClick(View View){

        Intent buttonClick;

        switch(View.getId()){
            case(R.id.ballotButton1):
                ballotQuestions.fileToLoad = R.layout.ballot_1;
                buttonClick = new Intent(this, ballotQuestions.class);
                startActivity(buttonClick);
                break;
            case(R.id.ballotButton2):
                ballotQuestions.fileToLoad = R.layout.ballot_2;
                buttonClick = new Intent(this, ballotQuestions.class);
                startActivity(buttonClick);
                break;
            case(R.id.ballotButton3):
                ballotQuestions.fileToLoad = R.layout.ballot_3;
                buttonClick = new Intent(this, ballotQuestions.class);
                startActivity(buttonClick);
                break;
        }
    }

}