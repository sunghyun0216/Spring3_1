package com.iu.s3.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.iu.s3.board.BoardDTO;
import com.iu.s3.util.Pager;

@Controller
@RequestMapping("/qna/**")
public class QnaController {

	@Autowired
	private QnaService qnaService;

	@GetMapping("qnaDelete")
	public String setDelete(BoardDTO boardDTO)throws Exception{
		int result = qnaService.setDelete(boardDTO);

		return "redirect:../";
	}

	@GetMapping("qnaUpdate")
	public ModelAndView setUpdate(BoardDTO boardDTO, ModelAndView mv)throws Exception{
		boardDTO = qnaService.getSelect(boardDTO);
		mv.addObject("dto", boardDTO);
		mv.addObject("board", "qna");
		mv.setViewName("board/boardUpdate");
		return mv;
	}

	@GetMapping("qnaSelect")
	public ModelAndView getSelect(BoardDTO boardDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		boardDTO = qnaService.getSelect(boardDTO);
		mv.addObject("dto", "qna");
		mv.addObject("board", "qna");
		mv.setViewName("board/boardSelect");
		return mv;
	}

	@GetMapping("qnaList")
	public ModelAndView getList(Pager pager)throws Exception{
		ModelAndView mv = new ModelAndView();
		List<BoardDTO> ar = qnaService.getList(pager);
		mv.addObject("list", ar);
		mv.addObject("board", "qna");
		mv.setViewName("board/boardList");

		return mv;	
	}

	@GetMapping("qnaInsert")
	public ModelAndView setInsert()throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board/boardInsert");
		mv.addObject("board", "qna");

		return mv;
	}

}