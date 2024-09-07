package com.pix.wu;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class BankController {

	@Autowired
	BankService bankService;
	
	@PostMapping("/addUserInfo")
	public ResponseEntity<String> createUser(@RequestBody BankInfo bankInfo){
		String accountInfo=bankService.createUserInfo(bankInfo);
		if(accountInfo=="new Account created successfully")
			return new ResponseEntity<>(accountInfo,HttpStatus.CREATED);
		else {
			return new ResponseEntity<>(accountInfo,HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/getAllUsers")
	public ResponseEntity<List<BankInfo>> getAllUsers(){
		List<BankInfo> allUsers=bankService.getUsers();
		return new ResponseEntity<>(allUsers,HttpStatus.OK);
	}
	
}
