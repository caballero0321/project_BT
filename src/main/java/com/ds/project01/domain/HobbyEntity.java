package com.ds.project01.domain;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="hobby_tb")
public class HobbyEntity {
	
	
	@Id
	@Column(name = "hobby_cd", length = 300, unique = true)
	private String hobbyCd;
	
	@Column(name = "hobby_nm", length = 300, unique = true)
	private String hobbyNm;
	
	
	
}