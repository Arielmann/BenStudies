package testrepository.ariel.ben01buttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the button
        Button benButton = (Button) findViewById(R.id.benButton);


        //Find the TextView
        final TextView arielTextView = (TextView) findViewById(R.id.benTV);


        //Create the connection between the click to the button
        benButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Set the text
                arielTextView.setText("Ariel & Ben");
            }
        });
    }
}
