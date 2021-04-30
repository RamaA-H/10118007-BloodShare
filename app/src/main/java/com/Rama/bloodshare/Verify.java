package com.Rama.bloodshare;

/*
Tanggal Pengerjaan : Jum'at, 30 April 2021
NIM : 10118007
Nama : Rama Al Halik
Kelas : IF-1
 */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Verify extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
    }

    public void pindahHome(View view) {
        Button btn_send = (Button) findViewById(R.id.btnVerifySend);
        String verify = btn_send.getText().toString();
        Log.d("Main", "Nama : " + verify);
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}