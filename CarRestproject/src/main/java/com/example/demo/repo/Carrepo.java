package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Car;

@Repository
public interface Carrepo extends JpaRepository<Car,Integer>{

}
