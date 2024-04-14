package com.actors.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="actorslist")
public class Actors {
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	private String name;
	private int age;
	private String role;
	private int noOfMoviesActed;
	private String favoriteMovie;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getNoOfMoviesActed() {
		return noOfMoviesActed;
	}
	public void setNoOfMoviesActed(int noOfMoviesActed) {
		this.noOfMoviesActed = noOfMoviesActed;
	}
	public String getFavoriteMovie() {
		return favoriteMovie;
	}
	public void setFavoriteMovie(String favoriteMovie) {
		this.favoriteMovie = favoriteMovie;
	}
	@Override
	public String toString() {
		return "Actors [name=" + name + ", age=" + age + ", role=" + role + ", noOfMovies=" + noOfMoviesActed
				+ ", favoriteMovie=" + favoriteMovie + "]";
	}
	
	
	
	
	
	
	

}
