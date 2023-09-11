package com.cj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cj.model.Traininfo;
import com.cj.repository.TrainRepository;

@Service
public class TrainServiceIMPL implements TrainService {
@Autowired
private TrainRepository repo;

@Override
public Traininfo savedata(Traininfo info) {

	return repo.save(info);
}

@Override
public List<Traininfo> getall() {
	
	return repo.findAll();
}

@Override
public Traininfo getdata(int trainno) {
	
	return repo.findById(trainno).get();
}

@Override
public Traininfo deletedata(int trainno) {

	repo.deleteById(trainno);
	return null ;
}

	
	
}
