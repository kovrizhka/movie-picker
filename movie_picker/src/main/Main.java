package main;
import main.entity.Film;
import main.entity.FilmLibrary;
import main.entity.User;

public class Main {
    public static void main(String[] args) {

        /**
         * говорим методу main что есть библиотека фильмов в классе FilmLibrary (знакомим ёпта)
         * говорим что есть юзер (называем его зрителем)
         */
        FilmLibrary filmLibrary = new FilmLibrary();
        User viewer = new User();


        /**
         * генерим список фильмов путём вызова метода класса FilmLibrary
         */
        filmLibrary.filmToLibrary();


        /**
         *  сортируем библиотеку фильмов
         */
        filmLibrary.sortingFilmsByRating();


        /**
         * вызываем приветствие зрителю
         */
        viewer.greeting();


        /**
         * показываем фильмы на основе приветствия
         */
        viewer.filmSelection();


        for (Film film: viewer.getFilmsByGenre()) {
            System.out.println(film.getTitle());
        }



    }
}