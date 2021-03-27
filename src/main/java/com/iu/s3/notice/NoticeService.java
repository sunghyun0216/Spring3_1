package com.iu.s3.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeService {
 
	@Autowired
	private NoticeDAO noticeDAO;
	
	public List<NoticeDTO> getList()throws Exception{
		return noticeDAO.getList();
	}
	
	public NoticeDTO getSelect(NoticeDTO noticeDTO)throws Exception{
		return noticeDAO.getSelect(noticeDTO);
	}
	
	public int setUpdate(NoticeDTO noticeDTO)throws Exception{
		return noticeDAO.setUpdate(noticeDTO);
	}
	
}
