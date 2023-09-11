package com.cj.service;

import java.util.List;

import com.cj.model.Traininfo;

public interface TrainService {

	Traininfo savedata(Traininfo info);

	List<Traininfo> getall();

	Traininfo getdata(int trainno);

	Traininfo deletedata(int trainno);

}
