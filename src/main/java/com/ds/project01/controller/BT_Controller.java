package com.ds.project01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ds.project01.domain.DeptEntity;
import com.ds.project01.domain.HobbyDataEntity;
import com.ds.project01.domain.HobbyEntity;
import com.ds.project01.domain.UserEntity;
import com.ds.project01.dto.HobbyDataDto;
import com.ds.project01.dto.UserDto;
import com.ds.project01.service.BT_Service;

@RestController
public class BT_Controller {

	@Autowired
	private BT_Service service;
	
	
	@GetMapping("/bt/deptList")
	public List<DeptEntity> user_deptList() {
		
		return service.deptList();
	}
	
	@GetMapping("/bt/hobbyList")
	public List<HobbyEntity> user_hobbyList() {
		
		return service.hobbyList();
	}
	
	@GetMapping("/bt/list")
	public List<UserEntity> admin_list(String searchKeyword) {
		
		return service.adminList(searchKeyword);
	}

	@PostMapping("/bt/userSave")
	public ResponseEntity<UserDto> user_save(@RequestBody UserDto dto) {
		service.insert(dto);
		return ResponseEntity.ok(dto);
	}
	
	@PostMapping("/bt/hobbyDataSave")
	public ResponseEntity<HobbyDataDto> hobbyData_save(@RequestBody HobbyDataDto hdDto) {
		service.hobbyDataInsert(hdDto);
		return ResponseEntity.ok(hdDto);
	}

	
	@GetMapping("/bt/view")
	UserEntity userView(String userId, Model model){ 
		
		return service.view(userId);
	}
	
	@GetMapping("/bt/hobbyDataList")
	List<HobbyDataEntity> HobbyDataList(String userId){
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaa"+userId);
		return service.HobbyDataView(userId);
	}
	
	@PostMapping("/bt/delete")
	public ResponseEntity<UserDto> user_delete(@RequestBody UserDto dto) {
		service.delete(dto);
		return ResponseEntity.ok(dto);
	}
	
}