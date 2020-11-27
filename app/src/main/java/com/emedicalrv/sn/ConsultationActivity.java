package com.emedicalrv.sn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConsultationActivity extends AppCompatActivity {
    private androidx.cardview.widget.CardView create_cons,list_cons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultation);

        create_cons = findViewById(R.id.create_cons);
        list_cons = findViewById(R.id.list_cons);

        create_cons.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                Intent intent = new Intent(ConsultationActivity.this, CreateConsultActivity.class);
                startActivity(intent);

            }
        });

        list_cons.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                Intent intent = new Intent(ConsultationActivity.this, ListConsultActivity.class);
                startActivity(intent);

            }
        });
    }
}