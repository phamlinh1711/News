package com.example.news;

public class SettingItem {
    private String itemName;
    private int icon;

    public SettingItem(String itemName, int icon) {
        this.itemName = itemName;
        this.icon = icon;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
