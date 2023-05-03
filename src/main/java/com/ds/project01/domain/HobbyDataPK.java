package com.ds.project01.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HobbyDataPK implements Serializable{ 
	
	
	private static final long serialVersionUID = 1L; 

	private String userEntity;
	
	private String hobbyEntity;
	

}