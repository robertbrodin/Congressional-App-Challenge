package org.risingtide.congressionalappchallenge;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.MenuItem;

public class registerToVote extends HomeScreenActivity{
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_vote);


        drawerLayout = findViewById(R.id.drawer_layout_register);

        NavigationView navigationView = findViewById(R.id.navview_home_register);
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
}
