package com.company;

import java.util.List;
import java.util.Scanner;

public class FindClass implements FindAble{
    Scanner scanner = new Scanner(System.in);

    @Override
    public void findMovieByName(List<Movie> movies) {
        System.out.println("Введите название фильма: ");
        String name = scanner.nextLine();
        for(Movie movie : movies){
            if(movie.getName().equals(name)){
                System.out.println("Фильм: "+movie.getName());
                System.out.println("Год: "+movie.getYear());
                System.out.println("Описание: "+ movie.getDescription());
                System.out.println("Директор: "+ movie.getDirector().getName()+" "+movie.getDirector().getLastName());
                System.out.println("=== * Каст * ===");
                for(Cast cast: movie.getCast()){
                    System.out.println("Актер: "+cast.getActor());
                    System.out.println("Роль: "+cast.getRole());
                }
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }
    }

    @Override
    public void findMovieByActor(List<Movie> movies) {

    }

    @Override
    public void findMovieByYear(List<Movie> movies) {


    }

    @Override
    public void findMovieByDirector(List<Movie> movies) {

    }

    @Override
    public void findMovieByDescription(List<Movie> movies) {

    }

    @Override
    public void findMovieByRole(List<Movie> movies) {

    }
}
