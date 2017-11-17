package com.codelab.favoritetoys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO (8) Declare a TextView variable called mToysListTextView

    private TextView mToysListTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO (10) Use findViewById to get a reference to the TextView from the layout
        mToysListTextView = (TextView) findViewById(R.id.tv_toy_names);

        // TODO (11) Use the static ToyBox.getToyNames method and store the names in a String array
        String[] toys = ToyBox.getToyNames();

        // TODO (12) Loop through each toy and append the name to the TextView (add \n for spacing)
        for (String toyName : toys) {
            mToysListTextView.append(toyName + "\n\n");
        }
    }
}
