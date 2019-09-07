package com.example.samplestickerapp.model;

public class CustomAdsApp {
    int id;
    String link;
    int imageid;

    public CustomAdsApp() {

    }

    public CustomAdsApp(int id, String link, int imageid) {
        this.id = id;
        this.link = link;
        this.imageid = imageid;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }
}
