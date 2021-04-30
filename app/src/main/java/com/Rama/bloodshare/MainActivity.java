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
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String MSG = "com.rifiandev.bloodshare.MSG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Main", "ON CREATE");
    }

    public void pindahRegister(View view){
        TextView txt_register = (TextView) findViewById(R.id.txtRegister);
        String register = txt_register.getText().toString();
        Log.d("Main", "Nama : "+register);
        Intent intent = new Intent (this, Register.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Main", "ON START");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Main", "ON RESUME");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Main", "ON RESTART");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Main", "ON PAUSE");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Main", "ON STOP");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Main", "ON DESTROY");
    }
}