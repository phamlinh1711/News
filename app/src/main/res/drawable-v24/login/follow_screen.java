package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class follow_screen extends AppCompatActivity {

    ListView followLV;
    ArrayList<ContentItem> contentItemArrayList;
    ContentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_follow_screen);
        getSupportActionBar().hide();

        AnhXa();
        ContentAdapter adapter = new ContentAdapter(this, R.layout.content_item, contentItemArrayList);
        followLV.setAdapter(adapter);
    }

    public void AnhXa(){
        followLV = (ListView) findViewById(R.id.followList);
        contentItemArrayList = new ArrayList<>();
        contentItemArrayList.add(new ContentItem("Rủ bạn cùng lớp về ăn nhậu rồi hiếp dâm tại nhà", "Báo Công An", R.drawable.c));
        contentItemArrayList.add(new ContentItem("Rủ bạn cùng lớp về ăn nhậu rồi hiếp dâm tại nhà", "Báo Công An", R.drawable.c));
        contentItemArrayList.add(new ContentItem("Rủ bạn cùng lớp về ăn nhậu rồi hiếp dâm tại nhà", "Báo Công An", R.drawable.c));
        contentItemArrayList.add(new ContentItem("Rủ bạn cùng lớp về ăn nhậu rồi hiếp dâm tại nhà", "Báo Công An", R.drawable.c));
        contentItemArrayList.add(new ContentItem("Rủ bạn cùng lớp về ăn nhậu rồi hiếp dâm tại nhà", "Báo Công An", R.drawable.c));
        contentItemArrayList.add(new ContentItem("Rủ bạn cùng lớp về ăn nhậu rồi hiếp dâm tại nhà", "Báo Công An", R.drawable.c));
        contentItemArrayList.add(new ContentItem("Rủ bạn cùng lớp về ăn nhậu rồi hiếp dâm tại nhà", "Báo Công An", R.drawable.c));
        contentItemArrayList.add(new ContentItem("Rủ bạn cùng lớp về ăn nhậu rồi hiếp dâm tại nhà", "Báo Công An", R.drawable.c));
        contentItemArrayList.add(new ContentItem("Rủ bạn cùng lớp về ăn nhậu rồi hiếp dâm tại nhà", "Báo Công An", R.drawable.c));

    }
}