package org.risingtide.congressionalappchallenge;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;

public class quizActivity extends HomeScreenActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);

    }

    public void quizCheck(View view){
        int buttonID;
        buttonID =((Button)view).getId();

        String buttonName;
        buttonName = ((Button)view).getText().toString();

        Log.d("TAG", Integer.toString(buttonID));

        TextView textView;
        textView = (findViewById(R.id.num17));



        if(buttonName.equals("Yes")){
            quizVariablesClass.points++;
            quizVariablesClass.times++;
        }
        if(quizVariablesClass.times == 2){
            if(quizVariablesClass.points == 2){
                textView.setText("You are eligible to vote!");

            }
            else if(quizVariablesClass.points == 1){
                textView.setText("You are not eligible to vote! You need to be a U.S Citizen and over 18.");
            }
            else{
                textView.setText("Why are you even taking this quiz?");
            }

        }

    }

}