package com.example.news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class Account extends AppCompatActivity {

    ListView settingLV;
    ListView listSP;
    ArrayList<SettingItem> settingItemArrayList;
    ArrayList<SettingItem> settingItemArrayList1;
    SettingAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        getSupportActionBar().hide();

        AnhXa();
        SettingAdapter adapter = new SettingAdapter(Account.this, R.layout.setting_item, settingItemArrayList);
        settingLV.setAdapter(adapter);

        SettingAdapter adapter1 = new SettingAdapter(Account.this, R.layout.setting_item, settingItemArrayList1);
        listSP.setAdapter(adapter1);

        final ImageButton imgAccountBack = (ImageButton) findViewById(R.id.imgAccountBack);
        imgAccountBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBackAccount = new Intent(Account.this, HomePage.class);
                startActivity(intentBackAccount);
            }
        });
    }

    public void AnhXa(){
        settingLV = (ListView) findViewById(R.id.settingList);
        settingItemArrayList = new ArrayList<>();
        settingItemArrayList.add(new SettingItem("Font & cỡ chữ", R.mipmap.ic_font));
        settingItemArrayList.add(new SettingItem("Màu nền", R.mipmap.ic_theme));
        settingItemArrayList.add(new SettingItem("Thông báo", R.mipmap.ic_bell));

        listSP = (ListView) findViewById(R.id.listSP);
        settingItemArrayList1 = new ArrayList<>();
        settingItemArrayList1.add(new SettingItem("Liên hệ", R.mipmap.ic_phone));
        settingItemArrayList1.add(new SettingItem("Chính sách bảo mật", R.mipmap.ic_lock));
        settingItemArrayList1.add(new SettingItem("Email góp ý", R.mipmap.ic_email));
        settingItemArrayList1.add(new SettingItem("Trợ giúp & hỗ trợ", R.mipmap.ic_support));
    }
}