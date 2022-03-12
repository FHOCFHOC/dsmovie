package com.corinto.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corinto.dsmovie.entities.Score;
import com.corinto.dsmovie.entities.ScorePK;


public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}