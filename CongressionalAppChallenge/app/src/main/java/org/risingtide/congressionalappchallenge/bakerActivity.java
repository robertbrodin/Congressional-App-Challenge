package org.risingtide.congressionalappchallenge;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class bakerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Was having an issue that Centers went to candidates instead, the whole time it was going to the wrong activity.
        setContentView(R.layout.baker);
    }

}
