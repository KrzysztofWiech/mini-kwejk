package com.example.kwejk.model;

public class Gif {

    private String name;
    private String userName;
    private Boolean favourite;
    private int categoryId;

    public Gif(String name, String userName, Boolean favourite, int categoryId) {
        this.name = name;
        this.userName = userName;
        this.favourite = favourite;
        this.categoryId = categoryId;

        //this. - parametry w konstruktorze odwołują się do pól
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Boolean getFavourite() {
        return favourite;
    }

    public void setFavourite(Boolean favourite) {
        this.favourite = favourite;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
