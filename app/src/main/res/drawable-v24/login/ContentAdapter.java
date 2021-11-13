package com.example.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ContentAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    List<ContentItem> contentItemList;

    public ContentAdapter(Context context, int layout, List<ContentItem> contentItemList) {
        this.context = context;
        this.layout = layout;
        this.contentItemList = contentItemList;
    }

    @Override
    public int getCount() {
        return contentItemList.size();
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
        TextView txtTitle = (TextView) view.findViewById(R.id.txtItemName);
        TextView txtSource = (TextView) view.findViewById(R.id.txtSource);
        ImageView imageContent = (ImageView) view.findViewById(R.id.imageContent);

        ContentItem content = contentItemList.get(i);
        txtTitle.setText(content.getItemTitle());
        txtSource.setText(content.getItemSource());
        imageContent.setImageResource(content.getImage());

        return view;
    }
}
