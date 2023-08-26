package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Model;
import com.example.demo.Repository.Repository;
@Service
public class ApiService {
	@Autowired
 Repository br;

	public Model saveinfo(Model bb)
	{
	return br.save(bb);  //saving the data from repository into the database

	}

	public List<Model> savedetails(List<Model> bb)
	{
	return (List<Model>) br.saveAll(bb);
	}


	public List<Model> showinfo()
	{
	return br.findAll(); //retrieving the data that has been store in the database
	}
	public Model changeinfo(Model bb)
	{
	return br.saveAndFlush(bb);
	}

	public void deleteinfo(Model bb)
	{
	br.delete(bb);
	}

	//delete using path variable
	public void deleteId(int id)
	{
	br.deleteById(id);
	}

	//delete using request param is done

	public void deletepId(int id)
	{
	br.deleteById(id);
	}

}
