package com.example.demo.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.data.domain.Page;
import com.example.demo.Models.EmployeeEntity;
import com.example.demo.Repositories.Repository;
@Service
public class ApiService {
	
			@Autowired(required=true)
			Repository stRepo;
			public EmployeeEntity saveDetails(EmployeeEntity e)
			{
				return stRepo.save(e);
			}
			public List<EmployeeEntity> getDetails()
			{
				return stRepo.findAll();
			}
			public EmployeeEntity updateDetails(EmployeeEntity e1)
			{
				return stRepo.saveAndFlush(e1);
			}
			public void deleteDetails(int id)
			{
				stRepo.deleteById(id);
			}
			public List<EmployeeEntity> getSorted(String field)
			{
				return stRepo.findAll(Sort.by(Sort.Direction.ASC,field));
			}
			public List<EmployeeEntity> getWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
				Page<EmployeeEntity> page =stRepo.findAll(PageRequest.of(offset, pageSize));
				return page.getContent();
			}

		}
	
