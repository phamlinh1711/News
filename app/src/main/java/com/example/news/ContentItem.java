package com.example.news;

public class ContentItem {
    private String itemTitle;
    private String itemSource;
    private int image;

    public ContentItem(String itemTitle, String itemSource, int image) {
        this.itemTitle = itemTitle;
        this.itemSource = itemSource;
        this.image = image;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public String getItemSource() {
        return itemSource;
    }

    public void setItemSource(String itemSource) {
        this.itemSource = itemSource;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
