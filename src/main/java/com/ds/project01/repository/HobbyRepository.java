package com.ds.project01.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ds.project01.domain.HobbyEntity;


public interface HobbyRepository extends JpaRepository<HobbyEntity, String>{

	List<HobbyEntity> findAll();
}