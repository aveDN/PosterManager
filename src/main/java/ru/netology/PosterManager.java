package ru.netology;

public class PosterManager {

    private String[] movies = new String[0];
    private int posterLimit;

    public PosterManager() {
        this.posterLimit = 10;
    }

    public String[] findAll() {
        return movies;
    }

    public PosterManager(int limit) {
        this.posterLimit = limit;
    }

    public void addFilm(String film) {
        String[] result = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            result[i] = movies[i];
        }
        result[result.length - 1] = film;
        movies = result;
    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < posterLimit) {
            resultLength = movies.length;
        } else {
            resultLength = posterLimit;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }

}