package com.example.homework1z5123301;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.CountDownTimer;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;


public class MainActivity extends AppCompatActivity {
    private Button butt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int belt;

        TextView syd = (TextView) findViewById(R.id.sydTime);
        TextView bei = (TextView) findViewById(R.id.beiTime);
        TextView tok = (TextView) findViewById(R.id.tokTime);
        TextView was = (TextView) findViewById(R.id.wasTime);
        TextView lon = (TextView) findViewById(R.id.lonTime);

        syd.setText(date(10));
        bei.setText(date(8));
        tok.setText(date(9));
        was.setText(date(20));
        lon.setText(date(15));

        butt = findViewById(R.id.button2);
        butt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                moveToActivityTwo();
            }
        });

    }
    public static String date (int num){
        TimeZone tz = TimeZone.getTimeZone("GMT"+num);
        Calendar cal = Calendar.getInstance(tz);
        DateFormat df = new SimpleDateFormat( "hh:mm a");
        //DateFormat df = new SimpleDateFormat("hh:mm a");
        df.setCalendar(cal);
        df.setTimeZone(tz);
        String result = df.format(cal.getTime());

        return result;

    }
    public void moveToActivityTwo(){
        Intent inte = new Intent ( MainActivity.this, Main2Activity.class);
        startActivity(inte);
    }

}
