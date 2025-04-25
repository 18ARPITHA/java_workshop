package com.pes.movies.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class MovieEntity {
    //movie_id,
    private int movieId;
    private String movieName;
    private String  heroName;
    private String heroinName;
    private String movieHeroin;
    private String language;
    private LocalDate releaseDate;




}
