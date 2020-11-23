package com.example.SpringDataJpaWithHibernate;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;
	

	public void saveStudent(StudentVm studentVm) {
		StudentEntity entity = new StudentEntity();
		entity.setId(studentVm.getId());
		entity.setName(studentVm.getName());
		entity.setAge(studentVm.getAge());
		entity.setMarks(studentVm.getMarks());
		
		repository.save(entity);
	}

}
