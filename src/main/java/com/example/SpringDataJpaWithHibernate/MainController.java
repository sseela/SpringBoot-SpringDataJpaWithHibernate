package com.example.SpringDataJpaWithHibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@Autowired
	private StudentService service;

	@PostMapping(value="/saveStudent")
	public void saveStudent(@RequestBody final StudentVm studentVm) {
		this.service.saveStudent(studentVm);
	}
}
