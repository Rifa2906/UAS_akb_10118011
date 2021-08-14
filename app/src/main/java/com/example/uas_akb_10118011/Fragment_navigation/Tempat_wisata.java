package com.example.uas_akb_10118011.Fragment_navigation;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.uas_akb_10118011.R;

public class Tempat_wisata extends Fragment {

    //    Tanggal pengerjaan 11/08/2021
//    Moch Rifa Maulana N
//    10118011
//    IF 10

    String url_map = "https://www.google.com/maps/";
    String url_btn1 = "https://www.google.com/maps/place/Orchid+Forest+Cikole/@-6.780493,107.6352863,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68e038e1a71607:0x79f858778d1e2e62!8m2!3d-6.780493!4d107.637475";
    String url_btn_2 = "https://www.google.com/maps/place/Curug+Dago/@-6.8655225,107.6159991,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68e6de2e06f0f1:0xe61f70cd002fbbb3!8m2!3d-6.8655225!4d107.6181878";
    String url_btn_3 = "https://www.google.com/maps/place/D'+Dieuland/@-6.8418616,107.6212898,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68e0d5be0ccb09:0x67627cb5b6f1829e!8m2!3d-6.8419332!4d107.6234187";
    Button map,btn_1,btn_2,btn_3;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.tempat_wisata,container,false);
        map = view.findViewById(R.id.btn_lokasi);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(url_map);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        btn_1 = view.findViewById(R.id.btn_orchid);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse(url_btn1);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));

            }
        });

        btn_2 = view.findViewById(R.id.btn_curug);
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(url_btn_2);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        btn_3 = view.findViewById(R.id.btn_didieland);
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(url_btn_3);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });
        return view;
    }


}
