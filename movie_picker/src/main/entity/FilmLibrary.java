package main.entity;

import main.service.SortLibraryOfFilmsByRating;

import java.util.ArrayList;
import java.util.Collections;

public class FilmLibrary {



    public static ArrayList<Film> filmLibrary = new ArrayList<Film>(21);                               // список фильмов


    public void filmToLibrary() {                                                             //  метод добавления фильмов в список
        filmLibrary.add(iAmLegend);
        filmLibrary.add(strangerThings);
        filmLibrary.add(it);
        filmLibrary.add(alien);
        filmLibrary.add(residentEvil);
        filmLibrary.add(deadPool);
        filmLibrary.add(lawAbidingCitizen);
        filmLibrary.add(madMax);
        filmLibrary.add(kickAss);
        filmLibrary.add(mortalCombat);
        filmLibrary.add(daysOfSummer);
        filmLibrary.add(her);
        filmLibrary.add(notebook);
        filmLibrary.add(titanic);
        filmLibrary.add(devchata);
        filmLibrary.add(hangover);
        filmLibrary.add(garfield);
        filmLibrary.add(twinSitters);
        filmLibrary.add(scaryMovie);
        filmLibrary.add(dictator);

    }

    public void sortingFilmsByRating() {
        Collections.sort(filmLibrary, Collections.reverseOrder(new SortLibraryOfFilmsByRating()));
    }

    /**
     * Метод, принимающий оценку юзера на фильм и присваивающий новый рейтинг для фильма.
     * -необходим массив, хранящий КАЖДУЮ оценку на КАЖДЫЙ фильм (это по-хорошему)
     * но, т.к. условия заказчика позволяют делать грязь, я реализую это следующим образом:
     */

    public void rateFilm(double userRate, Film film) {
        FilmLibrary filmLibrary = new FilmLibrary();
        ArrayList<Film> allFilms = filmLibrary.getFilmLibrary();
        for (Film filmInLib: allFilms) {
            if (film.getTitle().equals(filmInLib.getTitle())) {
                double currentRating = filmInLib.getRating();
                double finalRating = (currentRating + userRate) / 2;
                filmInLib.setRating(finalRating);
                System.out.println("Старый рейтинг: "+ currentRating + ", новый рейтинг: " + filmInLib.getRating());
            }
        }
    }


    Film iAmLegend = new Film("Я легенда","Ужас",8.1);
    Film strangerThings = new Film("Странные вещи","Ужас",7.6);
    Film it = new Film("Это","Ужас",6.8);
    Film alien = new Film("Пришелец","Ужас",7.7);
    Film residentEvil = new Film("Обитель зла","Ужас",6.5);

    Film deadPool = new Film("Мертвый бассейн","Боевик",0);
    Film lawAbidingCitizen = new Film("Закон прочный гражданин","Боевик",0);
    Film madMax = new Film("Максим вне себя: Яростная Дорога","Боевик",0);
    Film kickAss = new Film("Пнуть-жёпу","Боевик",9.0);
    Film mortalCombat = new Film("Фатальное сражение","Боевик",0);

    Film daysOfSummer = new Film("500 дней лета","Мелодрама",0);
    Film her = new Film("Она","Мелодрама",0);
    Film notebook = new Film("Дневник памяти","Мелодрама",0);
    Film titanic = new Film("Титаник","Мелодрама",0);
    Film devchata = new Film("Девчата","Мелодрама",0);

    Film hangover = new Film("Мальчишник в Вегасе","Комедия",0);
    Film garfield = new Film("Гарфилд","Комедия",0);
    Film twinSitters = new Film("Няньки","Комедия",0);
    Film scaryMovie = new Film("Очень страшное кино","Комедия",0);
    Film dictator = new Film("Диктатор","Комедия",0);

    public ArrayList<Film> getFilmLibrary() {
        return filmLibrary;
    }


}
