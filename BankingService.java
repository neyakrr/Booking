package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import repo.AccountRepository;

@Service
public class BankingService {
	@Autowired
	private AccountRepository repo;
	
	@Transactional
	public void Booking(int Id)
	{
		repo.debit(Id);
	}

}
