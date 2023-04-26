package main.service;

import main.entity.Film;
import main.entity.User;
import main.entity.FilmLibrary;

import java.util.ArrayList;

public class FilmRecommendationSystem {
    ArrayList<Film> recommendedFilmsHorror = new ArrayList<Film>();
    ArrayList<Film> recommendedFilmsComedy = new ArrayList<Film>();
    ArrayList<Film> recommendedFilmsAction = new ArrayList<Film>();
    ArrayList<Film> recommendedFilmsMelodrama = new ArrayList<Film>();


    FilmLibrary filmLibrary = new FilmLibrary();                                            // обращаюсь к классу main.java.entity.FilmLibrary путём создания его объекта в этом классе



    public void genreDefinition(User user) {                                                // определяю жанр, чтобы запустить определенный метод подбора фильмов для записи их в определенный список
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