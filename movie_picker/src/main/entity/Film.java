package main.entity;

public class Film {
    private String title;
    private String genre;
    private Double rating;
    private int amountOfUserRates;
    private double userRate;

    public Film (String title, String genre, double rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.amountOfUserRates = amountOfUserRates;

    }

    /**
     * Метод, принимающий оценку юзера на фильм и присваивающий новый рейтинг для фильма.
     * -необходим массив, хранящий КАЖДУЮ оценку на КАЖДЫЙ фильм (это по-хорошему)
     * но, т.к. условия заказчика позволяют делать грязь, я реализую это следующим образом:
     */

    public void rateFilm(double userRate) {
        double newRate;
        if (getRating() == 0) {


        }
        newRate = 5;

        setRating(newRate);
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

