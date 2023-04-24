import java.util.ArrayList;
import java.util.Collections;
import java.util.function.ToDoubleFunction;

public class FilmLibrary {


    public ArrayList<Film> filmLibrary = new ArrayList<Film>(21);                               // список фильмов

    public ArrayList<Film> getFilmLibrary() {
        return filmLibrary;
    }

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


    Film iAmLegend = new Film("Я легенда","Ужас",8.1, 0);
    Film strangerThings = new Film("Странные вещи","Ужас",7.6, 0);
    Film it = new Film("Это","Ужас",6.8, 0);
    Film alien = new Film("Пришелец","Ужас",7.7, 0);
    Film residentEvil = new Film("Обитель зла","Ужас",6.5, 0);

    Film deadPool = new Film("Мертвый бассейн","Боевик",0, 0);
    Film lawAbidingCitizen = new Film("Закон прочный гражданин","Боевик",0, 0);
    Film madMax = new Film("Максим вне себя: Яростная Дорога","Боевик",0, 0);
    Film kickAss = new Film("Пнуть-жёпу","Боевик",9.0, 0);
    Film mortalCombat = new Film("Фатальное сражение","Боевик",0, 0);

    Film daysOfSummer = new Film("500 дней лета","Мелодрама",0, 0);
    Film her = new Film("Она","Мелодрама",0, 0);
    Film notebook = new Film("Дневник памяти","Мелодрама",0, 0);
    Film titanic = new Film("Титаник","Мелодрама",0, 0);
    Film devchata = new Film("Девчата","Мелодрама",0, 0);

    Film hangover = new Film("Мальчишник в Вегасе","Комедия",0, 0);
    Film garfield = new Film("Гарфилд","Комедия",0, 0);
    Film twinSitters = new Film("Няньки","Комедия",0, 0);
    Film scaryMovie = new Film("Очень страшное кино","Комедия",0, 0);
    Film dictator = new Film("Диктатор","Комедия",0, 0);


}
