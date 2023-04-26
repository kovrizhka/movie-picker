package main.entity;

public class Film {
    private String title;
    private String genre;
    private Double rating;
    private int sumOfRate;
    private double userRate;

    public Film (String title, String genre, double rating, int sumOfRate) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.sumOfRate = sumOfRate;

    }

    /**
     * метод, принимающий оценку юзера на фильм и присваивающий новый рейтинг для фильма
     */

//    public double rateFilm(double userRate) {
//        double newRate;
//        if main.java.entity.FilmLibrary filmLibrary sumOfRate == 0 {
//
//        }
//        newRate =
//
//        return newRate;
//    }


    /**
     *  Ниже сеттеры и геттеры для полей класса main.java.entity.Film
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

    public int getSumOfRate() {
        return sumOfRate;
    }

    public void setSumOfRate(int sumOfRate) {
        this.sumOfRate = sumOfRate;
    }

    public double getUserRate() {
        return userRate;
    }

    public void setUserRate(double userRate) {
        this.userRate = userRate;
    }

}

