package com.example.uas_akb_10118011;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.example.uas_akb_10118011.Fragment_navigation.Profile;
import com.example.uas_akb_10118011.Fragment_navigation.Tempat_wisata;
import com.example.uas_akb_10118011.Fragment_navigation.Tentang_aplikasi;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Bottom_navigation extends AppCompatActivity {
    //    Tanggal pengerjaan 11/08/2021
//    Moch Rifa Maulana N
//    10118011
//    IF 10

    BottomNavigationView bottomNavigationView;
    private BottomNavigationView.OnNavigationItemSelectedListener navigation = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(MenuItem item) {

            Fragment f = null;
            switch (item.getItemId()){
                case  R.id.menu_profile:
                    f = new Profile();
                    break;

                case  R.id.menu_wisata:
                    f = new Tempat_wisata();
                    break;

                case R.id.menu_tentang:
                    f = new Tentang_aplikasi();
                    break;

            }
            getSupportFragmentManager().beginTransaction().replace(R.id.isi,f).commit();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_navigation);
        bottomNavigationView = findViewById(R.id.button_navigation_menu);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigation);


    }
}