package com.example.e_commerce.models;

public class Course {
    int id;
    String img, title, date, level, colorCourses;

    public Course(int id, String img, String title, String date, String level, String colorCourses) {
        this.id = id;
        this.img = img;
        this.title = title;
        this.date = date;
        this.level = level;
        this.colorCourses = colorCourses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getColorCourses() {
        return colorCourses;
    }

    public void setColorCourses(String colorCourses) {
        this.colorCourses = colorCourses;
    }
}
