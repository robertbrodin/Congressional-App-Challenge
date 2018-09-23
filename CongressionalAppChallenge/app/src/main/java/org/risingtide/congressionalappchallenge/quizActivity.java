package org.risingtide.congressionalappchallenge;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

// Used for the logic behind the quiz.xml file.
public class quizActivity extends HomeScreenActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);

    }

    // quizCheck method will be used for the functionality of the quizActivity quiz.
    // onClick of a RadioButton on the quiz, this method will run and update the text on the screen -> whether they are eligible to vote or not.
    public void quizCheck(View view){

        // TextView textView will be used to update the text at the bottom of the activity.
        // That text will say whether you are eligible to vote or not.
        TextView bottomEligibilityTextView;
        bottomEligibilityTextView = (findViewById(R.id.num17));

        RadioButton test = findViewById(R.id.radioNo1);
        test.isChecked(); // Checks if the radio button has been checked.
        // Easiest thing to do is check if a button has been checked off, four conditional statements, set text based on that.

        TextView citizensText = findViewById(R.id.citizenText);
        TextView ageText = findViewById(R.id.ageText);

        // Checks if "Yes button 1" is checked.
        if(((RadioButton)findViewById(R.id.radioYes1)).isChecked()){
            citizensText.setText("");
        }
        else if (((RadioButton)findViewById(R.id.radioNo1)).isChecked()){
            citizensText.setText("You need to be a U.S citizen to be eligible to vote!");
            bottomEligibilityTextView.setText("You are not eligible to vote!");
        }

        if (((RadioButton)findViewById(R.id.radioYes2)).isChecked()){
            ageText.setText("");
        }
        else if (((RadioButton)findViewById(R.id.radioNo2)).isChecked()) {
            ageText.setText("You need to be over 18 years old to be eligible to vote!");
            bottomEligibilityTextView.setText("You are not eligible to vote!");
        }

        if(((RadioButton)findViewById(R.id.radioYes1)).isChecked() && ((RadioButton)findViewById(R.id.radioYes2)).isChecked()){
            citizensText.setText("");
            ageText.setText("");
            bottomEligibilityTextView.setText("You can register to vote!");
        }

        /*
        // Checks if the button pressed is equal to ID radioNo1 ("No button 1")
        // If so, the points variable is updated (see quizVariablesClass.java for more info) by adding 1.
        // Lastly, the TextView under the buttons is updated so it explains that you need to be a citizen to be eligible to vote.
        if(view.getId() == R.id.radioNo1.){
            // Answering that they are a U.S citizen
            // Will change the text under are you a U.S cititzen based on answer.
            // Adds on to points -> b/c they are not eligible
            Log.d("var1", Integer.toString(quizVariablesClass.getPoints()));
            quizVariablesClass.setPoints(1);
            TextView citizensText = findViewById(R.id.citizenText);
            RadioButton test = findViewById(R.id.radioNo1);
            test.isChecked()

            citizensText.setText("You need to be a U.S citizen to be eligible to vote!");
            }

        // Checks if the button pressed is equal to ID radioNo2("No button 2")
        // If so, the points variable is updated (see quizVariablesClass.java for more info) by adding 1.
        // Lastly, the TextView under the buttons is updated so it explains that you need to over 18 to vote.
        else if(view.getId() == R.id.radioNo2){
            // Answering that they are a U.S citizen
            // Will change the text under are you a U.S cititzen based on answer.
            // Adds on to points -> b/c they are not eligible
            Log.d("var2", Integer.toString(quizVariablesClass.getPoints()));
            quizVariablesClass.setPoints(1);
            TextView citizensText = findViewById(R.id.ageText);

            citizensText.setText("You need to be over 18 years old to vote!");
        }

        // Checks if the button pressed is equal to ID radioYes1("Yes button 1")
        // If so, the points variable is updated (see quizVariablesClass.java for more info) by subtracting 1.
        // Lastly, the TextView under this set of buttons (citizensText) is set to display nothing.
        else if(view.getId() == R.id.radioYes1){
            Log.d("var3", Integer.toString(quizVariablesClass.getPoints()));
            quizVariablesClass.setPoints(-1);
            TextView citizensText = findViewById(R.id.citizenText);
            citizensText.setText("");
        }

        // Checks if the button pressed is equal to ID radioYes2("Yes button 2")
        // If so, the points variable is updated (see quizVariablesClass.java for more info) by subtracting 1.
        // Lastly, the TextView under this set of buttons (citizensText) is set to display nothing.
        else if(view.getId() == R.id.radioYes2){
            Log.d("var4", Integer.toString(quizVariablesClass.getPoints()));
            quizVariablesClass.setPoints(-1);
            TextView citizensText = findViewById(R.id.ageText);

            citizensText.setText("");
        }

        // Checks if the points are greater than one.
        // Throughout this function/method, the points have been subtracted if you answered yes, and added if you answered no.
        // Therefore, if the number of points is greater than 0, you are not eligible to vote.
        if(quizVariablesClass.getPoints() > 0){
            textView.setText("You are not eligible to vote!");
        }

        // Otherwise, you are eligible to vote if your points are less than zero.
        else if(quizVariablesClass.getPoints()  <= 0){
            textView.setText("You are eligible to vote!");
        }
        */

    }

}