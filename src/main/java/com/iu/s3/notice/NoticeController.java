package com.iu.s3.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/notice/**")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping(value="noticeUpdate")
	public void setUpdate(NoticeDTO noticeDTO, Model model)throws Exception{
		noticeDTO = noticeService.getSelect(noticeDTO);
		model.addAttribute("dto", noticeDTO);
	}
	
	@RequestMapping(value="noticeUpdate", method = RequestMethod.POST)
	public String setUpdate(NoticeDTO noticeDTO)throws Exception{
		int result = noticeService.setUpdate(noticeDTO);
			return "redirect:./noticeList";
		
	}
	
	
	
	@RequestMapping(value="noticeList")
	public void getList(Model model)throws Exception{
		List<NoticeDTO> ar = noticeService.getList();
		model.addAttribute("list", ar);
	}
	
	@RequestMapping(value="noticeSelect")
	public ModelAndView getSelect(NoticeDTO noticeDTO)throws Exception{
		ModelAndView mv = new ModelAndView();

//		System.out.println(noticeDTO.getNum()); /값 확인
		noticeDTO = noticeService.getSelect(noticeDTO);
		
//		System.out.println(noticeDTO.getNum());
//		System.out.println(noticeDTO.getTitle());
		mv.addObject("dto", noticeDTO);
		mv.setViewName("notice/noticeSelect");
		return mv;
	}
	
	
	
}
