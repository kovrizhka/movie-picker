package main;
import main.entity.Film;
import main.entity.FilmLibrary;

public class Main {
    public static void main(String[] args) {

        /**
         * говорим методу main что есть класс main.java.entity.FilmLibrary (знакомим ёпта)
         */
        FilmLibrary filmLibrary = new FilmLibrary();


        /**
         * генерим список фильмов путём вызова метода класса main.java.entity.FilmLibrary
         */
        filmLibrary.filmToLibrary();


        /**
         *  сортируем библиотеку фильмов
         */
        filmLibrary.sortingFilmsByRating();

        for (Film film: filmLibrary.filmLibrary) {                         // вывод в консоль списка фильмов
            System.out.println("Фильм: "+ film.getTitle() + " с рейтингом: " + film.getRating());
        }

        /**
         * создаём юзера
         */
//        User greet = new User();
//        greet.greeting();




    }
}