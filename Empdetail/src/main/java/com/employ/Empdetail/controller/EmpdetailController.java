package com.employ.Empdetail.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employ.Empdetail.domain.Empdetail;
import com.employ.Empdetail.service.EmpdetailService;

@RestController
public class EmpdetailController {
	
	@Autowired
	private EmpdetailService service;
	@GetMapping("/empdetail")
	public List<Empdetail> viewData()
	{
		return service.listAll();	
	}

	@GetMapping("/empdetail/{id}")
 	public Empdetail getTask(@PathVariable int id)
	{
		return service.get(id);	
	}
	
	@PutMapping(value="/empdetail/{id}")
	public ResponseEntity<?> editEmpDEtailsPage(@RequestBody Empdetail newtask, @PathVariable int id) {
		try {
			Empdetail existingtask= service.get(id);
			existingtask.setEmpname(newtask.getEmpname());
			existingtask.setEmpmobile(newtask.getEmpmobile());
			existingtask.setEmpemail(newtask.getEmpemail());
			existingtask.setEmpaddress(newtask.getEmpaddress());
			existingtask.setEmppassword(newtask.getEmppassword());
			existingtask.setModifieddate(java.time.LocalDateTime.now());
			
			service.save(existingtask);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception exp) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/empdetail")
	public void add(@RequestBody Empdetail  empdetail)
	{
		empdetail.setCreateddate(java.time.LocalDateTime.now());
		empdetail.setModifieddate(java.time.LocalDateTime.now());
		service.save(empdetail);
	}
	
	@DeleteMapping("/empdetail/{id}")
	public void delete(@PathVariable int id)
	{
		service.delete(id);
	}
}
