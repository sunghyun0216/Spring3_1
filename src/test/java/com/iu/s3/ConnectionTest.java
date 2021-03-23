package com.iu.s3;

import static org.junit.Assert.*;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s3.member.MemberDTO;

public class ConnectionTest extends MyAbstractTest {
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private SqlSession sqlSession;
	
	@Autowired
	private MemberDTO memberDTO;
	
	@Test
	public void connectionTest() throws Exception {
		//primitive type, String
		//assertEquals(0, 0);
		
		//reference type
		assertNotNull(sqlSession);
		
		
	}
	

}
