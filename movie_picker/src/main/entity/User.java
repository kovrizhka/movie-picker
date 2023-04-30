package main.entity;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private String name;
    private String favouriteGenre;


    private ArrayList<Film> watchedFilms = new ArrayList<>();
    ArrayList<Film> filmsByGenre = new ArrayList<>();
    FilmLibrary filmLibrary2 = new FilmLibrary();
    Scanner sc = new Scanner(System.in);

    public void greeting() {
        System.out.println("Приветствуем в киносервисе!" + "\n" + "Укажи своё имя:");
        setName(sc.nextLine());
        System.out.println("Укажи жанр, который будешь смотреть:");
        setFavouriteGenre(sc.nextLine().toLowerCase());
    }


    /**
     *  Подбиратель фильмов
     *  тут в зависимости от выбранного жанра нужно пройтись по массиву filmLibrary
     *  и вытянуть оттуда фильмы подходящего жанра в новый массив,
     *  который уже будет через цикл выведен пользователю в данном методе
     */
    public void filmSelection() {
        //filmLibrary2.filmToLibrary();
        for (Film filmInStartLib: filmLibrary2.getFilmLibrary()) {
            if (filmInStartLib.getGenre().toLowerCase().equals(getFavouriteGenre())) {
                filmsByGenre.add(filmInStartLib);
            }
        }
        System.out.println("На основе твоих предпочтений предлагаем к просмотру:");
        for (Film filmInLibByGenre: filmsByGenre) {
            System.out.println("Фильм: "+ filmInLibByGenre.getTitle() + " с рейтингом: " + filmInLibByGenre.getRating());
        }
    }

    /**
     * Ниже сеттеры и геттеры для полей Юзера
     * @return
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavouriteGenre() {
        return favouriteGenre;
    }

    public void setFavouriteGenre(String favouriteGenre) {
        this.favouriteGenre = favouriteGenre;
    }

    public ArrayList<Film> getFilmsByGenre() {
        return filmsByGenre;
    }

    public ArrayList<Film> getWatchedFilms() {
        return watchedFilms;
    }

    public void setWatchedFilms(ArrayList<Film> watchedFilms) {
        this.watchedFilms = watchedFilms;
    }

}
