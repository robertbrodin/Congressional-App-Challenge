package org.risingtide.congressionalappchallenge;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

public class candidatesActivity extends HomeScreenActivity{
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.candidates);


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
    public void testCandidate(String candidateName){

        // Can change to the actual string file for candidates...
        switch(candidateName) {
            case("baker"):
                setContentView(R.layout.baker_polito);
                break;
            case("other"):
                setContentView(R.layout.test_candidate);
                break;
        }
    }

    // Method onClickCandidate will be used for clicking on the candidate images and taking the user to the candidate's information page.
    public void onClickCandidate(View view){

        Intent switchScreen;

        switch(view.getId()){
            // Baker
            case(R.id.bakerPic):
                // Sets fileToLoad(static) to the layout that is the app is going to switch to.
                individualCandidates.fileToLoad = R.layout.baker_polito;
                switchScreen = new Intent(this, individualCandidates.class);
                startActivity(switchScreen);
                break;
            case(R.id.gonzalezPic):
        // Sets fileToLoad(static) to the layout that is the app is going to switch to.
                individualCandidates.fileToLoad = R.layout.gonzalez_palfrey;
                switchScreen = new Intent(this, individualCandidates.class);
                startActivity(switchScreen);
                break;
            case(R.id.ballotButton):
                individualCandidates.fileToLoad = R.layout.ballot_questions;
                switchScreen = new Intent(this, individualCandidates.class);
                startActivity(switchScreen);
                break;
    }

    }

}
