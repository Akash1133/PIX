package com.pix.wu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService {
	
	@Autowired
	BankRepository bankRepository;
	
	public String createUserInfo(BankInfo bankInfo) {
		if(bankRepository.existsBankInfoByCPF(bankInfo.getCPF())) {
			return "CPF already Present. Cannot Create new account";
		}else {
			try {
				bankRepository.save(bankInfo);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return "new Account created successfully";
	}

	public List<BankInfo> getUsers() {
		List<BankInfo> users=bankRepository.findAll();

		// TODO Auto-generated method stub
		return users;
	}

}
