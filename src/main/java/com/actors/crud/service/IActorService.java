package com.actors.crud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.actors.crud.entity.Actors;


public interface IActorService {
	
	public Actors saveActors(Actors actors);
	
	public List<Actors> getAllActors();
	
	public Actors getActorById(Integer id);
	
	public void deleteActorById(Integer id);
	
	public Actors updateActors(Actors actors,Integer id);

}
