package main;
import main.entity.Film;
import main.entity.FilmLibrary;
import main.entity.User;
import main.service.FilmRecommendationSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /**
         * говорим методу main что есть библиотека фильмов в классе FilmLibrary (знакомим ёпта)
         * говорим что есть юзер (называем его зрителем)
         */
        FilmLibrary filmLibrary1 = new FilmLibrary();
        User viewer = new User();
        FilmRecommendationSystem recSys = new FilmRecommendationSystem();

        ArrayList<Film> watchedFilms = new ArrayList<>();


        /**
         * генерим список фильмов путём вызова метода класса FilmLibrary
         */
        filmLibrary1.filmToLibrary();


        /**
         *  сортируем библиотеку фильмов
         */
        filmLibrary1.sortingFilmsByRating();


        /**
         * вызываем приветствие зрителю
         */
        viewer.greeting();


        /**
         * показываем фильмы на основе приветствия
         */
         viewer.filmSelection();

        /**
         * запускаем выбор и просмотр фильм - в итоге он будем оценен и добавлен в просметренные
         */
        viewer.filmToWatch();

//        filmLibrary1.rateFilm(7, filmLibrary1.getFilmLibrary().get(3));
//
//        watchedFilms.add(filmLibrary1.getFilmLibrary().get(0));
//
//        viewer.setWatchedFilms(watchedFilms);
//
//        Film recommendFilm = recSys.recommendedFilm(viewer, filmLibrary1);
//
//        System.out.println(recommendFilm.getTitle());



    }
}