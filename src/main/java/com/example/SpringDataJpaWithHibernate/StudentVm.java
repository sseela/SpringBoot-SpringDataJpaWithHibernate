package com.example.SpringDataJpaWithHibernate;

import lombok.Data;

@Data
public class StudentVm {
	private int id;
	private String name;
	private int age;
	private int marks;
}
