package org.risingtide.congressionalappchallenge;

import android.os.Bundle;

public class centersActivity extends HomeScreenActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Was having an issue that Centers went to candidates instead, the whole time it was going to the wrong activity.
        setContentView(R.layout.centers);
    }
}