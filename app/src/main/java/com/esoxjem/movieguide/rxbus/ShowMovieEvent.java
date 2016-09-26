package com.esoxjem.movieguide.rxbus;

import com.esoxjem.movieguide.Movie;

/**
 * @author Ashwini Kumar.
 */
public class ShowMovieEvent
{
    private Movie movie;

    public ShowMovieEvent(Movie movie)
    {
        this.movie = movie;
    }

    public Movie getMovie()
    {
        return movie;
    }
}
