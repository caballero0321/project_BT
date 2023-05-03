package com.ds.project01.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ds.project01.domain.DeptEntity;


public interface DeptRepository extends JpaRepository<DeptEntity, String>{

	List<DeptEntity> findAll();
}