package com.iu.s3.account;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s3.MyAbstractTest;

public class AccountDAOTest extends MyAbstractTest {

	@Autowired
	private AccountDAO accountDAO;
	
	@Test
	public void getListTest()throws Exception{
		List<AccountDTO> ar = accountDAO.getList();
		assertNotEquals(0, ar.size());
	}
}
