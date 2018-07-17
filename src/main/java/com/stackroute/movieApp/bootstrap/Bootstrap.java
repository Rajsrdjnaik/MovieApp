package com.stackroute.movieApp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

import com.stackroute.movieApp.domain.Movie;
import com.stackroute.movieApp.movieRepository.MovieRepository;

@Configuration
public class Bootstrap implements ApplicationListener<ContextRefreshedEvent> {

	private MovieRepository mov;
	
	public Bootstrap(MovieRepository mov) {
		super();
		this.mov = mov;
	}
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
        mov.save(new Movie(1,"Rajat","1996","66666","Poster.jpg"));

	}

}
