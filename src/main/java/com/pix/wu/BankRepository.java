package com.pix.wu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BankRepository extends JpaRepository<BankInfo, String>{
	
	boolean existsBankInfoByCPF(String CPF);
}