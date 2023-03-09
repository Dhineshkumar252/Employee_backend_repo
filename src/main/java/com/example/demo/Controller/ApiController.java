package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ApiService;
import com.example.demo.Models.EmployeeEntity;
@RestController
@CrossOrigin

public class ApiController {
	@Autowired
	ApiService stuSer;
	@PostMapping("/add")
	public EmployeeEntity addInfo( @RequestBody EmployeeEntity st) {
		return stuSer.saveDetails(st);
	}
	@GetMapping("/show")
	public List<EmployeeEntity> fetchDetails()
	{
		return stuSer.getDetails();
	}
	@PutMapping("/Update")
	public EmployeeEntity updateInfo(@RequestBody EmployeeEntity st1)
	{
		return stuSer.updateDetails(st1);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteInfo(@PathVariable("id") int id){
	stuSer.deleteDetails(id);
	return "Deleted details";
	}
	//sorting
	@GetMapping("/product/{field}")
	public List<EmployeeEntity> getWithSort(@PathVariable String field) {
	return stuSer.getSorted(field);
			}

			// pagination
			@GetMapping("/product/{offset}/{pageSize}")
			public List<EmployeeEntity> productsWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
				return stuSer.getWithPagination(offset, pageSize);
			}
	}
   
