package com.emedicalrv.sn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AcceuilActivity extends AppCompatActivity {
    private androidx.cardview.widget.CardView a_presentation,a_appointment,a_consultation,a_help,a_hospital,a_patient;


        @Override
  protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil);
            a_presentation = findViewById(R.id.a_presentation);
           a_appointment = findViewById(R.id.a_appointment);
           a_consultation = findViewById(R.id.a_consultation);
           a_help = findViewById(R.id.a_help);
           a_hospital = findViewById(R.id.a_hospital);
           a_patient = findViewById(R.id.a_patient);

            a_presentation.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {


                    Intent intent = new Intent(AcceuilActivity.this, PresentationActivity.class);
                    startActivity(intent);

                }
            });
            a_appointment.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {


                    Intent intent = new Intent(AcceuilActivity.this, AppointmentActivity.class);
                    startActivity(intent);

                }
            });

            a_consultation.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {


                    Intent intent = new Intent(AcceuilActivity.this, ConsultationActivity.class);
                    startActivity(intent);

                }
            });
            a_help.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {


                    Intent intent = new Intent(AcceuilActivity.this, HelpActivity.class);
                    startActivity(intent);

                }
            });
            a_hospital.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {


                    Intent intent = new Intent(AcceuilActivity.this, HospitalActivity.class);
                    startActivity(intent);

                }
            });
            a_patient.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {


                    Intent intent = new Intent(AcceuilActivity.this, PatientActivity.class);
                    startActivity(intent);

                }
            });
    }
    }
