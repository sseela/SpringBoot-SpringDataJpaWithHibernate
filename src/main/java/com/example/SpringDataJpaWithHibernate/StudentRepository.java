package com.example.SpringDataJpaWithHibernate;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{

}
