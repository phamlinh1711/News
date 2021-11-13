package com.example.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SettingAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<SettingItem> settingItemList;

    public SettingAdapter(Context context, int layout, List<SettingItem> settingItemList) {
        this.context = context;
        this.layout = layout;
        this.settingItemList = settingItemList;
    }

    @Override
    public int getCount() {
        return settingItemList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);

        TextView txtSettingName = (TextView) view.findViewById(R.id.txtItemName);
        ImageView iconSetting = (ImageView) view.findViewById(R.id.iconSetting);

        SettingItem setting = settingItemList.get(i);

        txtSettingName.setText(setting.getItemName());
        iconSetting.setImageResource(setting.getIcon());

        return view;
    }
}
