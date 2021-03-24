package com.iu.s3.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bankbook/**") //bankbook쓰는애들 이리모여라 // value값이 2개면 value를 써줘야하지만 한개일 경우 생략가능(써도 되고 안써도됨) //폴더명을 넣어주는게 젤 좋음
public class BankBookController {
	
	@Autowired
	private BankBookService bankBookService;
	
	@RequestMapping("bankbookList") // 메서드 형식은 get 방식인데 안쓰면 get
	public void getList(Model model)throws Exception{
		List<BankBookDTO> ar = bankBookService.getList();
		model.addAttribute("list", ar);
	}
	
	@RequestMapping(value = "bankbookSelect") // get 방식
	public ModelAndView getSelect(BankBookDTO bankBookDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		bankBookDTO = bankBookService.getSelect(bankBookDTO);
		
		mv.addObject("dto", bankBookDTO);
		mv.setViewName("bankbook/bankbookSelect");
		return mv;
	}
	
}
