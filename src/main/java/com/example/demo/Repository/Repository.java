package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Model;


public interface Repository extends JpaRepository<Model, Integer>{

}
