package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.EmployeeEntity;



public interface Repository extends JpaRepository<EmployeeEntity,Integer>{

}
