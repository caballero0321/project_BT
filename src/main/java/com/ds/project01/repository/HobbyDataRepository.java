package com.ds.project01.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ds.project01.domain.HobbyDataEntity;


public interface HobbyDataRepository extends JpaRepository<HobbyDataEntity, String>{

	List<HobbyDataEntity> findByUserEntity_UserId(String userId);
	void deleteByUserEntity_UserId(String userID);
    
}