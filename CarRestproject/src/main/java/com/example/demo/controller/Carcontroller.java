package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Car;
import com.example.demo.service.Carservice;

@RestController
public class Carcontroller {
	@Autowired 
	Carservice service;
	
	@PostMapping(value="/Car",consumes=MediaType.APPLICATION_JSON_VALUE,produces="application/xml")
	public ResponseEntity<Car> createcars(@RequestBody Car car){
		
		System.out.println(car);
		service.savecar(car);
		return new ResponseEntity<Car>(car,HttpStatus.CREATED);
		
	}
	@GetMapping(value="/Cars")
	public ResponseEntity<List<Car>> listcars()
	{
		List<Car> list=service.listcars();
		return new ResponseEntity<List<Car>>(list,HttpStatus.CREATED);
		
	}
	@DeleteMapping(value="/Car/{id}")
	public ResponseEntity<String> deletestd (@PathVariable("id") int id)
	{
	    service.deletecar(id);
		return new ResponseEntity<String>("record deleted",HttpStatus.CREATED);
	}
	@PutMapping(value="/update",consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Car> updatelist(@RequestBody Car car1)
	{
	   car1 = service.savecar(car1);
	    return new ResponseEntity<Car>(car1,HttpStatus.CREATED);
	}
	@GetMapping(value="/Carbyid/{id}",consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Car> getbyId(@PathVariable("id") int id,@RequestBody Car car)
	{
		Car car1=service.getbyId(id);
		 return new ResponseEntity<Car>(car1,HttpStatus.CREATED);
		
	}


}
