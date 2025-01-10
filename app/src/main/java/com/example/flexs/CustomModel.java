package com.example.flexs;

public class CustomModel {
    int image;
    String title, dest;

    public CustomModel(int image, String title, String dest) {
        this.image = image;
        this.title = title;
        this.dest = dest;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }
}
