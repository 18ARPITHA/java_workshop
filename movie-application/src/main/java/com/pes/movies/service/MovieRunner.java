package com.pes.movies.service;

import com.pes.movies.entity.MovieEntity;
import com.pes.movies.repo.MovieRepo;
import com.pes.movies.repo.MovieRepoimpl;

import java.time.LocalDate;

public class MovieRunner {
    public static void main(String[] args){
        MovieEntity movieEntity=new MovieEntity();

        movieEntity.setMovieName("KGF 2");
        movieEntity.setHeroName("Yash");
        movieEntity.setMovieHeroin("Srinidhi");
        movieEntity.setLanguage("Kannada");
        movieEntity.setReleaseDate(LocalDate.of(2025,12,15));

        movieEntity.setMovieName("kantara");
        movieEntity.setHeroName("Yash");
        movieEntity.setMovieHeroin("Srinidhi");
        movieEntity.setLanguage("Kannada");
        movieEntity.setReleaseDate(LocalDate.of(2025,12,16));


        movieEntity.setMovieName("Pushpa");
        movieEntity.setHeroName("Yash");
        movieEntity.setMovieHeroin("Srinidhi");
        movieEntity.setLanguage("Kannada");
        movieEntity.setReleaseDate(LocalDate.of(2025,12,15));

        movieEntity.setMovieName("kantara");
        movieEntity.setHeroName("Yash");
        movieEntity.setMovieHeroin("Srinidhi");
        movieEntity.setLanguage("Kannada");
        movieEntity.setReleaseDate(LocalDate.of(2025,12,16));

        movieEntity.setMovieName("Beast");
        movieEntity.setHeroName("Yash");
        movieEntity.setMovieHeroin("Srinidhi");
        movieEntity.setLanguage("Kannada");
        movieEntity.setReleaseDate(LocalDate.of(2025,12,15));

        movieEntity.setMovieName("milana");
        movieEntity.setHeroName("Yash");
        movieEntity.setMovieHeroin("Srinidhi");
        movieEntity.setLanguage("Kannada");
        movieEntity.setReleaseDate(LocalDate.of(2025,12,15));



        MovieRepo repo=new MovieRepoimpl();
        repo.saveMovie(movieEntity);
    }

}
