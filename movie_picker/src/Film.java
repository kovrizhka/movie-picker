public class Film {
    private String title;
    private String genre;
    private Double rating;
    private int sumOfRate;
    private double userRate;

    public Film (String title, String genre, double rating, int sumOfRate) {      // конструктор для объектов (фильмов). Объекты созданы в классе FilmLibrary
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.sumOfRate = sumOfRate;

    }

//    public double rateFilm(double userRate) {                                     // метод, принимающий оценку юзера на фильм и присваивающий новый рейтинг для фильма
//        double newRate;
//        if FilmLibrary filmLibrary sumOfRate == 0 {                               // обратиться к sumOfRate элемента списка filmLibrary
//
//        }
//        newRate =
//
//        return newRate;
//    }

                                                                                    // далее идут геттеры и сеттеры переменных класса Film


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

