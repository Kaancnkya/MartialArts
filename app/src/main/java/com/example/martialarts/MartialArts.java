package com.example.martialarts;

import java.io.Serializable;

public class MartialArts implements Serializable {
    private String tittle;
    private String summary;
    private int image;

    public MartialArts(String tittle, String summary, int image) {
        this.tittle = tittle;
        this.summary = summary;
        this.image = image;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
