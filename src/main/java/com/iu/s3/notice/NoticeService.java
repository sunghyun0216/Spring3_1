package com.iu.s3.notice;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.s3.util.Pager;

@Service
public class NoticeService {
 
	@Autowired
	private NoticeDAO noticeDAO;
	
	public int setInsert(NoticeDTO noticeDTO)throws Exception{
		Calendar ca = Calendar.getInstance();
		return noticeDAO.setInsert(noticeDTO);
	}
	
	public List<NoticeDTO> getList()throws Exception{
		Pager pager = new Pager();
		pager.setStartRow(11);
		pager.setLastRow(20);
		
		return noticeDAO.getList(pager);
	}
	
	public NoticeDTO getSelect(NoticeDTO noticeDTO)throws Exception{
		return noticeDAO.getSelect(noticeDTO);
	}
	
	public int setUpdate(NoticeDTO noticeDTO)throws Exception{
		return noticeDAO.setUpdate(noticeDTO);
	}
	
	public int setDelete(NoticeDTO noticeDTO)throws Exception{
		return noticeDAO.setDelete(noticeDTO);
	}
	
}
