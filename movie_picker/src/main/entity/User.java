package main.entity;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private String name;
    private String favouriteGenre;
    private int userRate;


    private ArrayList<Film> watchedFilms = new ArrayList<>();
    ArrayList<Film> filmsByGenre = new ArrayList<>();
    FilmLibrary generalFilmLibrary = new FilmLibrary();
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
        for (Film filmInStartLib: generalFilmLibrary.getFilmLibrary()) {
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
     * Метод просмотра фильма пользователем +
     *      добавление этого фильма в просмотренные фильмы +
     *      дать оценку фильму и сохранить её фильма и фильма в общей библиотеке
     *      и добавить в библиотеку просмотренных фильмов
     */
    public void filmToWatch() {
        System.out.println("Введи название фильма, который будешь смотреть: ");
        String film = sc.nextLine().toLowerCase();
        ArrayList<Film> generalFilmLib = generalFilmLibrary.getFilmLibrary();
        for (Film filmInGeneralLib: generalFilmLib) {
            for (Film filmInWatchedLib: watchedFilms) {
                if (filmInGeneralLib.getTitle().toLowerCase().equals(film)
                        && (!filmInWatchedLib.getTitle().toLowerCase().equals(film)
                        || watchedFilms.isEmpty())) {
                    System.out.println("А теперь оцени этот фильм от 1 до 10: ");
                    int userRate = sc.nextInt();
                    setUserRate(userRate);
                    generalFilmLibrary.rateFilm(userRate, filmInGeneralLib);
                    watchedFilms.add(filmInGeneralLib);
                    System.out.println("Теперь фильм" + filmInWatchedLib.getTitle() + " имеет оценку: " + filmInWatchedLib.getRating());
                } else {
                    System.out.println("Этот фильм уже просмотрен и оценен или его нет в библиотеке");
                }
            }
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


    public int getUserRate() {
        return userRate;
    }
    public void setUserRate(int userRate) {
        this.userRate = userRate;
    }

}
