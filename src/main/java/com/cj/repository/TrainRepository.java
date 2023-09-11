package com.cj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cj.model.Traininfo;

public interface TrainRepository extends JpaRepository<Traininfo, Integer>{

}
