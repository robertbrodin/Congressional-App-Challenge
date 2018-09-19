package org.risingtide.congressionalappchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class HomeScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }

    public void testButtonClick(View View)
    {
        String button_text;
        button_text =((Button)View).getText().toString();
        if(button_text.equals("Test Screen"))
        {
            // If the button matches the target button, it sets the desired screen to the testActivity
            // Then starts that activity.
            Intent buttonClick = new Intent(this,testActivity.class);
            startActivity(buttonClick);
        }
        else if(button_text.equals("Home Button")){
            Intent buttonClick = new Intent(this,HomeScreenActivity.class);
            startActivity(buttonClick);


        }
        else if(button_text.equals("Register to Vote")){
            Intent buttonClick = new Intent(this,registerToVote.class);
            startActivity(buttonClick);

        }
    }
}
