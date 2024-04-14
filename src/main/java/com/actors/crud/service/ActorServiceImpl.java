package com.actors.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.actors.crud.entity.Actors;
import com.actors.crud.repository.IActorRespository;

@Component
public class ActorServiceImpl implements IActorService {
	
	@Autowired
	IActorRespository iActorRespository;



	@Override
	public Actors saveActors(Actors actors) {
		
		// TODO Auto-generated method stub
		System.out.println("Service Layer:"+actors);
		return iActorRespository.save(actors);
	}

	@Override
	public List<Actors> getAllActors() {
		// TODO Auto-generated method stub
		return iActorRespository.findAll();
	}

	@Override
	public Actors getActorById(Integer id) {
		// TODO Auto-generated method stub
		
		return iActorRespository.findById(id).get();
	}

	@Override
	public void deleteActorById(Integer id) {
		// TODO Auto-generated method stub
		iActorRespository.deleteById(id);
	}

	@Override
	public Actors updateActors(Actors actors, Integer id) {
		// TODO Auto-generated method stub
		
		Actors existingRecord=iActorRespository.findById(id).get();
		
		existingRecord.setName(actors.getName());
		existingRecord.setAge(actors.getAge());
		existingRecord.setRole(actors.getRole());
		existingRecord.setNoOfMoviesActed(actors.getNoOfMoviesActed());
		existingRecord.setFavoriteMovie(actors.getFavoriteMovie());
		
		return iActorRespository.save(existingRecord);
	}

	



}
