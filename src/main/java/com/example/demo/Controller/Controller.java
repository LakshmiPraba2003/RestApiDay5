package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Model;
import com.example.demo.Service.ApiService;


@RestController
public class Controller {
	@Autowired
	ApiService sser;


	@PostMapping("addingbook")

	public Model add(@RequestBody Model bb)
	{
	return sser.saveinfo(bb);

	}

	@PostMapping("addnbooks")

	public List<Model> addndetails(@RequestBody List<Model> bb)
	{
	return sser.savedetails(bb);
	}

	@GetMapping("showbooks")

	public List<Model> show()
	{
	return sser.showinfo();
	}
    
	@PutMapping("updatebooks")
	public Model modify(@RequestBody Model bb)
	{
	return sser.changeinfo(bb);
	}

	@DeleteMapping("deletebooks")
	public String del(@RequestBody Model bb)
	{
	sser.deleteinfo(bb);
	return "Deleted successfully";
	}

	@DeleteMapping("deleteid/{id}")
	public void deletemyid(@PathVariable int id)
	{
	sser.deleteId(id);

	}
	@DeleteMapping("delparamid")

	public void deletemyparamid(@RequestParam int id)
	{
	sser.deletepId(id);

	}
	
	
	}




