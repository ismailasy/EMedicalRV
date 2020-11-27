package com.emedicalrv.sn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AppointmentActivity extends AppCompatActivity {
    private androidx.cardview.widget.CardView ap_create_rv,ap_list_rv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);

        ap_create_rv = findViewById(R.id.ap_create_rv);
        ap_list_rv = findViewById(R.id.ap_list_rv);

        ap_create_rv.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                Intent intent = new Intent(AppointmentActivity.this, CreateRdvActivity.class);
                startActivity(intent);

            }
        });

        ap_list_rv.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                Intent intent = new Intent(AppointmentActivity.this, ListRdvActivity.class);
                startActivity(intent);

            }
        });
    }
}