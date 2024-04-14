package com.actors.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.actors.crud.entity.Actors;

@Component
public interface IActorRespository extends JpaRepository<Actors, Integer>{

}
