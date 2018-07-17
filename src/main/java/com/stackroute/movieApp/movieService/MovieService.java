package com.stackroute.movieApp.movieService;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.stackroute.movieApp.domain.Movie;
import com.stackroute.movieApp.exception.MovieAlreadyExistException;
import com.stackroute.movieApp.exception.MovieNotFoundException;

@Service
public interface MovieService {
	
	public Movie addMovie(Movie movie) throws MovieAlreadyExistException;
	public Iterable<Movie> getAllMovies();
	public void deleteMovie(int id) throws MovieNotFoundException;
	public Movie updateMovie(int id, Movie movie) throws MovieNotFoundException;
	public Optional<Movie> getMovieById(int id) throws MovieNotFoundException;
	public List<Movie> getMovieByTitle(String title) throws MovieNotFoundException;
}
