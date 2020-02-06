package com.acentria.multirecycler;

public class Movie {
    private int image;
    private int type;

    public  static final int ONE_TYPE=1;
    public static final int TWO_TYPE=2;

    public Movie() {
    }

    public Movie(int image , int type) {
        this.image = image;
        this.type=type;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    //    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String name) {
//        this.title = name;
//    }
//
//    public String getYear() {
//        return year;
//    }
//
//    public void setYear(String year) {
//        this.year = year;
//    }
//
//    public String getGenre() {
//        return genre;
//    }
//
//    public void setGenre(String genre) {
//        this.genre = genre;
//    }
}