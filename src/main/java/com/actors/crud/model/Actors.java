package com.actors.crud.model;

import lombok.Data;

@Data
public class Actors {
	
	private int id;
	private String name;
	private int age;
	private String role;
	private int noOfMoviesActed;
	private String favoriteMovie;

}
