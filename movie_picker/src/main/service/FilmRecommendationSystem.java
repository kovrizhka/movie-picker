package main.service;

import main.entity.Film;
import main.entity.User;
import main.entity.FilmLibrary;

import java.util.ArrayList;
import java.util.Collections;

public class FilmRecommendationSystem {
    ArrayList<Film> recommendedFilmsHorror = new ArrayList<Film>();
    ArrayList<Film> recommendedFilmsComedy = new ArrayList<Film>();
    ArrayList<Film> recommendedFilmsAction = new ArrayList<Film>();
    ArrayList<Film> recommendedFilmsMelodrama = new ArrayList<Film>();

    FilmLibrary filmLibrary = new FilmLibrary();
    User user = new User();


    /**
     * Метод даёт рекомендацию фильма, с учетом:
     * 1) жанра
     * 2) просмотренных фильмов
     * 3) сортированный по рейтингу (сначала с высокой оценкой)
     * Для работы нужны два входных параметра: пользователь и библиотека всех фильмов
     * @param user - принимает объект класса User для вызова его методов
     * @param filmLibrary - принимает объект класса FilmLibrary для вызова его методов
     * @return - возвращает список рекомендуемых фильмов
     */
    public Film recommendedFilm(User user, FilmLibrary filmLibrary) {
        String userGenre = user.getFavouriteGenre();
        ArrayList<Film> watchedFilms = user.getWatchedFilms();
        ArrayList<Film> recommendedFilmsByGenre = new ArrayList<>();
        ArrayList<Film> finalFilmList = new ArrayList<>();
        for (Film film: watchedFilms) {
            if (film.getGenre().toLowerCase().equals(userGenre)) {
                recommendedFilmsByGenre.add(film);
            }
        }
        for (Film watchedFilm: watchedFilms) {
            for (Film recommFilm: recommendedFilmsByGenre) {
                if (!watchedFilm.getTitle().equals(recommFilm.getTitle())) {
                    finalFilmList.add(recommFilm);
                }
            }
        }
        if (finalFilmList.isEmpty()) {
            return null;
        } else {
            Collections.sort(finalFilmList, Collections.reverseOrder(new SortLibraryOfFilmsByRating()));
            return finalFilmList.get(0);
        }
    }



    /**
     * определяю жанр, чтобы запустить определенный метод подбора фильмов для записи их в определенный список
     * @param user
     */
    public void genreDefinition(User user) {
        if (user.getFavouriteGenre().toLowerCase().equals("ужас")) {
            horrorSelection(user, filmLibrary);
        }
        if (user.getFavouriteGenre().toLowerCase().equals("комедия")) {
            comedySelection(user, filmLibrary);
        }
        if (user.getFavouriteGenre().toLowerCase().equals("боевик")) {
            actionSelection(user, filmLibrary);
        }
        if (user.getFavouriteGenre().toLowerCase().equals("мелодрама")) {
            melodramaSelection(user, filmLibrary);
        }
    }



    public void horrorSelection(User user, FilmLibrary filmLibrary) {                        // методы подбора фильмов
        for (Film film: filmLibrary.filmLibrary) {
            if (film.getGenre().toLowerCase().equals("ужас")) {
                recommendedFilmsHorror.add(film);
            }
        }
    }
    public void comedySelection(User user, FilmLibrary filmLibrary) {
        for (Film film: filmLibrary.filmLibrary) {
            if (film.getGenre().toLowerCase().equals("комедия")) {
                recommendedFilmsComedy.add(film);

            }
        }
    }
    public void actionSelection(User user, FilmLibrary filmLibrary) {
        for (Film film: filmLibrary.filmLibrary) {
            if (film.getGenre().toLowerCase().equals("боевик")) {
                recommendedFilmsAction.add(film);

            }
        }
    }
    public void melodramaSelection(User user, FilmLibrary filmLibrary) {
        for (Film film: filmLibrary.filmLibrary) {
            if (film.getGenre().toLowerCase().equals("мелодрама")) {
                recommendedFilmsMelodrama.add(film);

            }
        }
    }


}