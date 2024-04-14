package com.actors.crud.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.actors.crud.entity.Actors;
import com.actors.crud.service.IActorService;

@RestController
public class ActorsController {
	
	@Autowired
	IActorService iActorService;
	
	@PostMapping("/insert")
	public 	ResponseEntity<Actors>  insert(@RequestBody Actors actors) {
		
		System.out.println(actors);
		
		Actors actor = iActorService.saveActors(actors);
		if(actor!=null) {
			return new ResponseEntity<Actors>(actor, HttpStatus.OK);
		}else {
		return new ResponseEntity<Actors>(actor, HttpStatus.NOT_FOUND); 
		}
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<Actors>>  getAll() {
		
		List<Actors> actorsList=iActorService.getAllActors();
		
		if(actorsList.isEmpty()) {
			return new ResponseEntity<List<Actors>>(actorsList, HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<List<Actors>>(actorsList, HttpStatus.OK);
	}
	
	@GetMapping("getbyid/{id}")
	public ResponseEntity<Actors>  getActorsById(@PathVariable("id") Integer id) {
		
		
		Actors actor = iActorService.getActorById(id);
		if(actor==null) {
			return new ResponseEntity<Actors>(actor, HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<Actors>(actor, HttpStatus.OK);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteActorById(@PathVariable("id") Integer id) {
		
		iActorService.deleteActorById(id);
	
		return "Deleted Succeessfully";
	}
	
	@PutMapping("updateactor/{id}")
	public ResponseEntity<Actors> updateActor(@RequestBody Actors actors,@PathVariable("id") Integer id) {
		
		
		Actors actor = iActorService.updateActors(actors, id);
		if(actor==null) {
			return new ResponseEntity<Actors>(actor, HttpStatus.NOT_ACCEPTABLE);
		}
		return new ResponseEntity<Actors>(actor, HttpStatus.OK); 
		
		
	}

}
