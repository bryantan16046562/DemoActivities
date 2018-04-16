package demoactivities.android.myapplicationdev.com.demoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_activities);

        //get button and set onclicklistener
        Button btndone = (Button) findViewById(R.id.buttonDone);
        btndone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etName = (EditText) findViewById(R.id.editTextName);
                EditText etAge = (EditText) findViewById(R.id.editTextAge);

                //name and age into array
                String[] info = { etName.getText().toString(), etAge.getText().toString() };

                //create intent to DemoActivities
                Intent i = new Intent(MainActivity.this, DemoActivities2.class);
                i.putExtra("info", info);
                startActivity(i);
            }
        });
    }
}
