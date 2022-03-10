package com.corinto.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corinto.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}