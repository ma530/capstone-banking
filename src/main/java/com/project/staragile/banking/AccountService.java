package com.project.staragile.banking;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
	
	@Autowired
	AccountRepository accountRepository;
	
	public Account createAccount() {
		Account account = new Account(1010101010,"Shubham","Saving Account",20000.0);
		return accountRepository.save(account);
	}

	public Account registerAccount(Account account) {
		return accountRepository.save(account);
	}

	public Account getAccountDetails(int accountId) {
		return accountRepository.findById(accountId).get();
	}
	
	public Account registerDummyAccount() {
		Account account = new Account(1010101010,"Shubham","Saving Account",20000.0);
		return account;
	}
	

	public Account updateAccount(int accountNumber, Account updatedPolicy) {
		Account account = getAccountDetails(accountNumber);
		 if (Objects.nonNull(account) ) {
			 account.setAccountName(updatedPolicy.getAccountName());
			 accountRepository.save(account);
			 return account;
		 }
		return null;
	}

	public String deleteById(int accountNumber) {
		 Account account = getAccountDetails(accountNumber);
		  if (Objects.nonNull(account) ) {
			  accountRepository.delete(account);
			  return "Successfully Deleted";
		  }
			return "Deletion Failed";
	}



}
