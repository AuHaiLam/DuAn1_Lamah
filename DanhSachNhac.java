package com.example.AppMusic_AHL;

import android.app.ListActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.widget.ListViewAutoScrollHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class DanhSachNhac extends AppCompatActivity {
    ArrayList<Music> arrayList;
    ListView lvNhac;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        setContentView(R.layout.activity_danh_sach_nhac);

        lvNhac = findViewById(R.id.lvDanhsach);

        arrayList = new ArrayList<Music>();
        arrayList.add(new Music("Tập quen với cô đơn", "TiTi", "4:03", R.drawable.iconsinger,R.raw.tapquenvoicodon));
        arrayList.add(new Music("Tập quen với cô đơn", "TiTi", "4:03", R.drawable.iconsinger,R.raw.tapquenvoicodon));
        arrayList.add(new Music("Tập quen với cô đơn", "TiTi", "4:03", R.drawable.iconsinger,R.raw.tapquenvoicodon));
        arrayList.add(new Music("Tập quen với cô đơn", "TiTi", "4:03", R.drawable.iconsinger,R.raw.tapquenvoicodon));
        arrayList.add(new Music("Tập quen với cô đơn", "TiTi", "4:03", R.drawable.iconsinger,R.raw.tapquenvoicodon));
        arrayList.add(new Music("Tập quen với cô đơn", "TiTi", "4:03", R.drawable.iconsinger,R.raw.tapquenvoicodon));

        MusicAdapter musicAdapter = new MusicAdapter(DanhSachNhac.this, R.layout.item_list_music, arrayList);


        lvNhac.setAdapter(musicAdapter);
        lvNhac.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(DanhSachNhac.this,PhatNhac.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case R.id.menu_one:

                intent = new Intent(DanhSachNhac.this, Nhac_Fragment.class);
                startActivity(intent);
                break;

            default:
                onBackPressed();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}


