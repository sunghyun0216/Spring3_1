package com.iu.s3.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.s3.bankbook.BankBookDTO;
import com.iu.s3.member.MemberDTO;

@Repository
public class NoticeDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.s3.notice.NoticeDAO.";
	
	public int setInsert(NoticeDTO noticeDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"setInsert", noticeDTO);
	}

	public List<NoticeDTO> getList()throws Exception{
		return sqlSession.selectList(NAMESPACE+"getList");
	}

	public NoticeDTO getSelect(NoticeDTO noticeDTO)throws Exception{
		noticeDTO= sqlSession.selectOne(NAMESPACE+"getSelect", noticeDTO);
		return noticeDTO;
	}
	
	public int setUpdate(NoticeDTO noticeDTO)throws Exception{
		return sqlSession.update(NAMESPACE+"setUpdate", noticeDTO);
	}
	
	public int setDelete(NoticeDTO noticeDTO)throws Exception{
		return sqlSession.update(NAMESPACE+"setDelete", noticeDTO);
	}

}
