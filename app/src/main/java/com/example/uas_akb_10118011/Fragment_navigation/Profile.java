package com.example.uas_akb_10118011.Fragment_navigation;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.uas_akb_10118011.R;

public class Profile extends Fragment {

//    Tanggal pengerjaan 11/08/2021
//    Moch Rifa Maulana
//    10118011
//    IF 10

    ImageButton ig,fb;
    String url_ig = "https://www.instagram.com/mochripamaulanan/";
    String url_fb = "https://www.facebook.com/moch.rifamaulanan/";


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.profile, container, false);
        ig = view.findViewById(R.id.ib_ig);
        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl(url_ig);
            }
        });

        fb = view.findViewById(R.id.ib_fb);
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl(url_fb);
            }
        });

        return view;
    }

    public void gotoUrl(String url){
        Uri uri = Uri.parse(url);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
