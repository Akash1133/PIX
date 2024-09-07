package com.pix.wu;

import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

@Entity
public class BankInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ID;
	@Column(unique=true)
	private String CPF;
	private String bankCode;
	private String bankName;
	private String accountNumber;
	private String branchCode;


	public BankInfo() {
		super();
	}


	public BankInfo(Long iD, String cPF, String bankCode, String bankName, String accountNumber, String branchCode) {
		super();
		ID = iD;
		CPF = cPF;
		this.bankCode = bankCode;
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.branchCode = branchCode;
	}


	public Long getID() {
		return ID;
	}


	public void setID(Long iD) {
		ID = iD;
	}


	public String getCPF() {
		return CPF;
	}


	public void setCPF(String cPF) {
		CPF = cPF;
	}


	public String getBankCode() {
		return bankCode;
	}


	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getBranchCode() {
		return branchCode;
	}


	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}


	@Override
	public String toString() {
		return "BankInfo [ID=" + ID + ", CPF=" + CPF + ", bankCode=" + bankCode + ", bankName=" + bankName
				+ ", accountNumber=" + accountNumber + ", branchCode=" + branchCode + "]";
	}
}
