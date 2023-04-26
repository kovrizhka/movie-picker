package main.entity;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private String name;
    private String favouriteGenre;

    FilmLibrary filmLibrary = new FilmLibrary();
    Scanner sc = new Scanner(System.in);

    public void greeting() {
        System.out.println("Приветствуем в киносервисе!" + "\n" + "Укажи своё имя:");
        setName(sc.nextLine());
        System.out.println("Укажи жанр, который будешь смотреть:");
        setFavouriteGenre(sc.nextLine());
    }

    /**
     *  Подбиратель фильмов
     *  тут в зависимости от выбранного жанра нужно пройтись по массиву filmLibrary
     *  и вытянуть оттуда фильмы подходящего жанра в новый массив,
     *  который уже будет через цикл выведен пользователю в данном методе
     */
    public void filmSelection() {
        System.out.println("На основе твоих предпочтений предлагаем к просмотру:");
        for (Film film: filmLibrary.filmLibrary) {
            System.out.println("Фильм: "+ film.getTitle() + " с рейтингом: " + film.getRating());
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
}
