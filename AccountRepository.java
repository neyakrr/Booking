package repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void debit(int id ) {
		jdbcTemplate.update("UPDATE account SET balance = balance - ? WHERE pno=?",200,id);
	}

}
