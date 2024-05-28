package com.example.myapplication.Domain;

public class Category {
    private int id;
    private String ImagePath;
    private String Name;

    public Category(){}

    public int getId() {
        return id;
    }

    public String getImagePath() {
        return ImagePath;
    }

    public String getName() {
        return Name;
    }

    public void setImagePath(String imagePath) {
        ImagePath = imagePath;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.Name = name;
    }

}
