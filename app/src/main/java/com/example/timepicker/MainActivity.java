package com.example.timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TimePicker timePicker;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shoeTime();
    }

    public void shoeTime(){
        timePicker = (TimePicker)findViewById(R.id.time);
        button = (Button)findViewById(R.id.button_show_time);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),timePicker.getCurrentHour() + " : " + timePicker.getCurrentMinute(),Toast.LENGTH_LONG).show();

            }
        });
    }
}