package com.iu.s3.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.s3.bankbook.BankBookDTO;

@Repository
public class NoticeDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.s3.notice.NoticeDAO";
	
	public List<NoticeDTO> getList()throws Exception{
		return sqlSession.selectList(NAMESPACE+"getList");
	}
	
	public BankBookDTO getSelect(BankBookDTO bankBookDTO)throws Exception{
		bankBookDTO = sqlSession.selectOne(NAMESPACE+"getSelect", bankBookDTO);
		return bankBookDTO;
	}
	
}
