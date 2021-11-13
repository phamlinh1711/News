package com.example.login;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class viewpage extends FragmentStatePagerAdapter {

    public viewpage(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag=null;
        switch (position){
            case 0:
                frag = new thoisu();
                break;
            case 1:
                frag = new thethao();
                break;
            case 2:
                frag = new giaitri();
                break;
            case 3:
                frag = new Congnghe();
                break;
            case 4:
                frag = new game();
                break;
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title = "Tin nóng";
                break;
            case 1:
                title = "Thể thao";
                break;
            case 2:
                title = "giải trí";
                break;
            case 3:
                title = "công nghệ";
                break;
            case 4:
                title = "Du lịch";
                break;
        }
        return title;
    }
}