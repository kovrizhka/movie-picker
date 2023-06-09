package main.entity;

import java.util.ArrayList;

public class Film {
    private String title;
    private String genre;
    private Double rating;
    private double userRate;

    public Film (String title, String genre, double rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }



    /**
     *  Ниже сеттеры и геттеры для полей класса Film
     * @return
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public double getUserRate() {
        return userRate;
    }

    public void setUserRate(double userRate) {
        this.userRate = userRate;
    }

}

