package com.example.homework1z5123301;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.CountDownTimer;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
public class Main2Activity extends AppCompatActivity {
    private Button butt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

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

        butt2 = findViewById(R.id.button);
        butt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                moveToMainActivity();
            }
        });
    }

    public static String date(int num){
        TimeZone tz = TimeZone.getTimeZone("GMT"+num);
        Calendar cal = Calendar.getInstance(tz);
        DateFormat sdf = new SimpleDateFormat( "HH:mm");
        //DateFormat df = new SimpleDateFormat("HH:MM"); for 24hr
        sdf.setCalendar(cal);
        sdf.setTimeZone(tz);
        String result = sdf.format(cal.getTime());

        return result;
    }


    public void moveToMainActivity(){
        Intent inte = new Intent ( Main2Activity.this, MainActivity.class);
        startActivity(inte);
    }
}
