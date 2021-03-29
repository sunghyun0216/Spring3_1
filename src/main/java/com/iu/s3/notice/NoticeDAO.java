package com.iu.s3.notice;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.s3.bankbook.BankBookDTO;
import com.iu.s3.member.MemberDTO;
import com.iu.s3.util.Pager;

@Repository
public class NoticeDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.s3.notice.NoticeDAO.";
	
	public void setHitUpdate (NoticeDTO noticeDTO)throws Exception{
		
	}
	
	public int setInsert(NoticeDTO noticeDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"setInsert", noticeDTO);
	}

	public List<NoticeDTO> getList(Pager pager)throws Exception{
//		HashMap<String, Long> map = new HashMap<String, Long>(); //map은 key와 value 형식으로 되어있음
//		map.put("startRow", 1L);
//		map.put("lastRow", 10L);
		
		
		return sqlSession.selectList(NAMESPACE+"getList", pager);
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
