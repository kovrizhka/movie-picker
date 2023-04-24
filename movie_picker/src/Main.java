import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FilmLibrary filmLibrary = new FilmLibrary();           // говорим методу main что есть класс FilmLibrary (знакомим ёпта)

        filmLibrary.filmToLibrary();                           // генерим список фильмов

        ArrayList<Film> sortedFilms = filmLibrary.filmLibrary; // создал список фильмов ссылаясь на этот же список, который в другом класс (хз зачем, кажется это не обязательно)

        filmLibrary.sortingFilmsByRating();                    // вызываю метод сортировки фильмов

        for (Film film: sortedFilms) {                         // вывод в консоль списка фильмов
            System.out.println("Фильм: "+ film.getTitle() + " с рейтингом: " + film.getRating());
        }
//
//        User greet = new User();                             // создаем юзера
//        greet.greeting();




    }
}