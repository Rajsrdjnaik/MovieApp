package com.stackroute.movieApp.movieRepository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.movieApp.domain.Movie;
@Repository
public interface MovieRepository extends MongoRepository<Movie, Integer> {
		
	List<Movie> findByTitle(String title);
	
}
