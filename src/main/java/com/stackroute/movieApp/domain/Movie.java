package com.stackroute.movieApp.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "domain")
public class Movie {

	@Id
	private int id;
	private String title;
	private String year;
	private String imdbId;
	private String poster;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getImdbId() {
		return imdbId;
	}
	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public Movie() {
		super();
	}
	public Movie(int id, String title, String year, String imdbId, String poster) {
		super();
		this.id=id;
		this.title = title;
		this.year = year;
		this.imdbId = imdbId;
		this.poster = poster;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", year=" + year + ", imdbId=" + imdbId + ", poster=" + poster
				+ "]";
	}
}
