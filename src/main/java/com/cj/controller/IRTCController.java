package com.cj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cj.model.Traininfo;
import com.cj.service.TrainService;

@RestController
@RequestMapping("/irtc-con")
public class IRTCController {
	
	@Autowired
	private TrainService service;
	
	@GetMapping("/")
	public ResponseEntity<String> test()
	{
		return new ResponseEntity<String>("irtc-con",HttpStatus.OK);
	}
	
	@PostMapping("/traininfo")
	public ResponseEntity<Traininfo> savedata(@RequestBody Traininfo info)
	{
		return new ResponseEntity<Traininfo>(service.savedata(info),HttpStatus.CREATED);
	}
	
	@GetMapping("/traininfos")
	public ResponseEntity<List<Traininfo>> getall()
	{
		return new ResponseEntity<List<Traininfo>>(service.getall(),HttpStatus.OK);
	}
	
	@GetMapping("{trainno}")
	public ResponseEntity<Traininfo>getdata(@PathVariable int trainno)
	{
		return new ResponseEntity<Traininfo>(service.getdata(trainno),HttpStatus.OK);
	}
    @DeleteMapping("{trainno}")
	public ResponseEntity<Traininfo>deletedata(@PathVariable int trainno)
	{
    	return new ResponseEntity<Traininfo>(service.deletedata(trainno),HttpStatus.NO_CONTENT);
	}
	
}
