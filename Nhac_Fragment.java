package com.example.AppMusic_AHL;

import android.app.ActionBar;
import android.app.ActivityManager;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Nhac_Fragment extends Fragment {

    ImageView imageDanhSach, imageYeuThich, imageTheLoai,imageCaSi;

    public Nhac_Fragment(){}

    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_nhac__fragment, container, false);
        imageDanhSach = (ImageView) view.findViewById(R.id.ImDanhSach);
        imageCaSi = (ImageView) view.findViewById(R.id.ImCaSi);
        imageTheLoai = (ImageView) view.findViewById(R.id.ImTheLoai);
        imageYeuThich = (ImageView) view.findViewById(R.id.ImYeuThich);

        imageDanhSach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(),DanhSachNhac.class );
                startActivity(intent);


            }
        });

        imageYeuThich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(),DanhSachPlayList.class );
                startActivity(intent);

            }
        });

        imageTheLoai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(),DanhSachTheLoai.class );
                startActivity(intent);


            }
        });

        imageCaSi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(),DanhSachCaSi.class );
                startActivity(intent);


            }
        });



        return view;

    }



}
