package com.example.utsku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.time.OffsetDateTime;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.date);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            OffsetDateTime offset = OffsetDateTime.now();
            textView.setText(String.valueOf(offset.getDayOfWeek() + " , " + getCurrentDate() ));
        }
    }

    public String getCurrentDate(){
        final Calendar c = Calendar.getInstance();
        int year, month, day;
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        day = c.get(Calendar.DATE);

        return day + " " + (month + 1) + " " + year;
    }

    public void handle(View view) {
        Intent intent = new Intent(this, Siswa.class);
        startActivity(intent);
    }


}
