package com.iu.s3.notice;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s3.MyAbstractTest;
import com.iu.s3.bankbook.BankBookDTO;

public class NoticeDAOTest extends MyAbstractTest {

	@Autowired
	private NoticeDAO noticeDAO;
	
	@Test
	public void setUpdateTest()throws Exception{
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setNum(3);
		
		noticeDTO = noticeDAO.getSelect(noticeDTO);
		
		System.out.println(noticeDTO.getNum());
		System.out.println(noticeDTO.getTitle());
		noticeDTO.setTitle("아이유 3집");
	    noticeDTO.setContents("너랑나");
		
		int result = noticeDAO.setUpdate(noticeDTO);
		
		assertEquals(1, result);
	}
	
	@Test
	public void getListTest()throws Exception{
		List<NoticeDTO> ar = noticeDAO.getList();
		assertNotEquals(0, ar.size());
	}
	
	@Test
	public void getSelectTest()throws Exception{
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setNum(1);
		noticeDTO.setTitle("home");
		noticeDTO.setWriter("iu");
		noticeDTO.setContents("과제는 무서워");
		noticeDTO.setHit(1);
		noticeDTO.setRegdate(null);	
	}
	
	
	

}
