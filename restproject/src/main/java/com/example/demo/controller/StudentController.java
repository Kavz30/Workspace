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

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService service;
	@PostMapping(value="/print",consumes=MediaType.APPLICATION_JSON_VALUE,produces="application/xml")
	public ResponseEntity<Student> print(@RequestBody Student stu)
	{
		System.out.println(stu);
		service.store(stu);
		return new ResponseEntity<Student>(stu,HttpStatus.CREATED);
	}
	@GetMapping(value="/Students",consumes=MediaType.APPLICATION_JSON_VALUE,produces="application/xml")
	public ResponseEntity<List<Student>> getstds(@RequestBody Student stu)
	{
		List<Student> list=service.getStudents();
		return new ResponseEntity<List<Student>>(list,HttpStatus.CREATED);
	}
	@GetMapping(value="/Students/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Student> getstd (@PathVariable("id") int id)
	{
	    Student std=service.getStudent(id);
		return new ResponseEntity<Student>(std,HttpStatus.CREATED);
	}
	@PutMapping(value="/Student",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Student> updatestd (@RequestBody Student std)
	{
	    service.store(std);
		return new ResponseEntity<Student>(std,HttpStatus.CREATED);
	}
	@DeleteMapping(value="/delete/{id}",consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> deletestd (@PathVariable("id") int id)
	{
	    service.delete(id);
		return new ResponseEntity<String>("record deleted",HttpStatus.CREATED);
	}


	

}
