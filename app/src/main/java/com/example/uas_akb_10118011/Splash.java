package com.example.uas_akb_10118011;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    //    Tanggal pengerjaan 10/08/2021
//    Moch Rifa Maualana N
//    10118011
//    IF10

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread thread = new Thread(){
            public void run(){
                try {
                    sleep(2000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    startActivity(new Intent(Splash.this,MainActivity.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}