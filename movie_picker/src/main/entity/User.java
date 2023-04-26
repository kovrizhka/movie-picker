package main.entity;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private String name;
    private String favouriteGenre;

    ArrayList<Film> watchedFilm = new ArrayList<Film>();
    Scanner sc = new Scanner(System.in);

    public void greeting() {
        System.out.println("Приветствуем в киносервисе!" + "\n" + "Укажи своё имя:");
        setName(sc.nextLine());
        System.out.println("Укажи жанр, который будешь смотреть:");
        setFavouriteGenre(sc.nextLine());
    }

    public void filmSelection() {
        System.out.println("На основе твоих предпочтений прелагаем к просмотру:");
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
