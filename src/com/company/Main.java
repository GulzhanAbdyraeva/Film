package com.company;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    FindAble findAble = new FindClass();

    Director director = new Director("Jaulan","Nurkamalov");
    Director director1 = new Director("Nurmuhammed", "Nurbekov");
    List<Cast> casts = new ArrayList<>();
    casts.add(new Cast("Nurdin","Cowboy"));
    casts.add(new Cast("Dastan", "Badboy"));

    Director director2 =  new Director("Nurmuhammed", "Nurbedov");
    List<Cast> cast1 = new ArrayList<>();
    cast1.add(new Cast("Nurbek","Captain"));
    cast1.add(new Cast("Maksat", "Hacker"));

    List<Movie> movies = new ArrayList<>();
    movies.add(new Movie("Java-6", 2022, "film",director1,casts));
    movies.add(new Movie("Peaksoft",2022,"film", director2,cast1));

    findAble.findMovieByName(movies);

    }
}
