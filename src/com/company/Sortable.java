package com.company;
import java.util.List;
public interface Sortable {
    void sortByMovieName(List<Movie>moviies);
    void sortByYear(List<Movie>movies);
    void sortByDirection(List<Movie> movies);
    void sortByActor(List<Movie>movies);

}
