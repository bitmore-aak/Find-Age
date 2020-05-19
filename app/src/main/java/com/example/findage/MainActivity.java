package com.example.findage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private EditText etDOB;
    private TextView tvShowAge;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etDOB = (EditText) findViewById(R.id.etDOB);
        tvShowAge = (TextView) findViewById(R.id.tvShowAge);
    }

    public void btnFindAge(View view) {
        int DOB = Integer.parseInt(etDOB.getText().toString());
        //get device current time
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(calendar.YEAR);
        int Age = year - DOB;
        tvShowAge.setText("Your age is: " + Age + " " + "and in month " +Age*12 + ", in days "+ Age*365);

    }
}
