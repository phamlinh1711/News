package com.example.login;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new fragmentLarge();
            case 1:
                return new fragmentSmall();

            default:
                return new fragmentLarge();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position){
        String title = "";
        switch (position) {
            case 0:
                title = "Danh sách lớn";
                break;
            case 1:
                title = "Danh sách nhỏ";
                break;
        }
        return title;
    }
}
