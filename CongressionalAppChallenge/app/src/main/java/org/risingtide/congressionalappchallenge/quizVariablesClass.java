package org.risingtide.congressionalappchallenge;
import android.util.Log;

public class quizVariablesClass {

    static int points = 1;

    public static void setPoints(int toAdd){
        points = points + toAdd;
        Log.d("points set", Integer.toString(points));
    }
    public static int getPoints(){
        return points;
    }
}
