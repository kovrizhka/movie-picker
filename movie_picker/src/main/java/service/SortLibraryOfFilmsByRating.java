package main.java.service;

import main.java.entity.Film;

import java.util.Comparator;

public class SortLibraryOfFilmsByRating implements Comparator<Film> {
    @Override
    public int compare(Film film1, Film film2) {
        double delta = film1.getRating() - film2.getRating();
        if (delta > 0){
            return 1;
        }
        if (delta < 0){
            return -1;
        }
        return 0 ;
    }
}
