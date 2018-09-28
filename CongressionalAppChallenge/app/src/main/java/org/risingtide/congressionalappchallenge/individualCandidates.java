package org.risingtide.congressionalappchallenge;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class individualCandidates extends AppCompatActivity {

    // Will be used to change the specific xml file the class loads. Will be changed under candidatesActivity -> specifically the onClickCandidate function.
    // Possible due to static functionality!
    public static int fileToLoad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Was having an issue that Centers went to candidates instead, the whole time it was going to the wrong activity.

        setContentView(fileToLoad);

        // Need some way to make it more efficient.
        // IDEA: Can edit the entire page for specific candidates based off of values.
    }

}
