package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Car;
import com.example.demo.repo.Carrepo;

@Service
public class Carservice {

	@Autowired
	Carrepo repo;
	public Car savecar(Car car) {
		 repo.save(car);
		 return car;
	}
	public List<Car> listcars() {
		List<Car> list=repo.findAll();
		return list;
	}
	public void deletecar(int carid) {
		repo.deleteById(carid);
		
	}
	public Car getbyId(int id) {
		Car car=repo.findById(id).orElse(new Car());
		return car;
	}
	
		
		
	

}
