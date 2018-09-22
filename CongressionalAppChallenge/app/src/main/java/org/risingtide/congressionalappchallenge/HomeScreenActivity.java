package org.risingtide.congressionalappchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class HomeScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }

    // Remember to add new activity to the ANDROID MANIFEST!!!
    public void testButtonClick(View View)
    {
        int clickedButtonID = ((Button)View).getId();
        Log.d("t", Integer.toString(clickedButtonID));
        String button_text = ((Button)View).getText().toString(); // filler for now

        // It is a lot more difficult to use IDs than text name.
        if(clickedButtonID == 2131165220) {
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
    }
}
