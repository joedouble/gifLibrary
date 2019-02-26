package com.detroitlabs.giflibrary.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Gif {

    private String name;
    private LocalDate dateUploaded;
    private String username;
    private boolean favorite;
    public String nameOfUploader;
    private int categoryId;

    public Gif(String name, LocalDate dateUploaded, String username, boolean favorite, int categoryId) {
        this.name = name;
        this.dateUploaded = dateUploaded;
        this.username = username;
        this.favorite = favorite;
        this.nameOfUploader = this.username.toLowerCase().replace(" ", "");
        this.categoryId = categoryId;
    }

    public String getNameOfUploader() {
        return nameOfUploader;
    }

    public int getId() {
        return categoryId;
    }

    public void setId(int id) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
