package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Statistics extends AppCompatActivity {
    TextView today;
    TextView yesterday;
    TextView affected;
    TextView death;
    TextView recovered;
    TextView active;
    TextView serious;
    ImageView back;
    TextView country;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);
        today =findViewById(R.id.textView9);
        yesterday =findViewById(R.id.textView10);
        affected =findViewById(R.id.textView12);
        death =findViewById(R.id.textView14);
        recovered =findViewById(R.id.textView18);
        active =findViewById(R.id.textView16);
        serious =findViewById(R.id.textView20);
        back =findViewById(R.id.imageView);
        country = findViewById(R.id.textView23);
        Intent result = getIntent();
        country.setText(result.getStringExtra("country"));

        today.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affected.setText("1000");
                death.setText("200");
                recovered.setText("400");
                active.setText("150");
                serious.setText("300");

            }
        });
        yesterday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affected.setText("600");
                death.setText("100");
                recovered.setText("300");
                active.setText("50");
                serious.setText("30");

            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Statistics.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
