package com.ds.project01.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserDto {
	
	@NotBlank(message = "ID은 필수 입력 값입니다.")
	private String userId;
	@NotBlank(message = "이름은 필수 입력 값입니다.")
	private String userNm;
	
	@NotEmpty(message = "이메일은 필수 입력 값입니다.")
	private String userEmlAddr;
	
	@NotEmpty(message = "부서명은 필수 입력 값입니다.")
	private String deptNo;
	
	@NotEmpty(message = "전화번호는 필수 입력 값입니다.")
	private String userTelno;
	
	private String userAddr;
	
	private String userAprvYn="n";
	
}