package com.iu.s3.member;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/member/**")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping("memberLogout")
	public String memberLogout(HttpSession session)throws Exception{
		session.invalidate(); //session의 유지시간을 0으로 만들겠다.
		return "redirect:../";
	}
	
	@RequestMapping("memberPage")
	public void memberPage()throws Exception{
		
	}
	
	@RequestMapping("memberDelete")
	public String memberDelete(HttpSession session)throws Exception{
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
		int result = memberService.memberDelete(memberDTO, session);
		session.invalidate();
		return "redirect:../";
	}
	
	@RequestMapping("memberUpdate")
	public void memberUpdate()throws Exception{}
	
	@RequestMapping(value="memberUpdate", method = RequestMethod.POST)
	public String memberUpdate(MemberDTO memberDTO, HttpSession session)throws Exception{
		int result = memberService.memberUpdate(memberDTO);
		
		if(result>0) {
			session.setAttribute("member", memberDTO);
		}
		return "redirect:../";
	}

	@RequestMapping("memberLogin")
	public void memberLogin()throws Exception{}
	
	@RequestMapping(value="memberLogin", method = RequestMethod.POST)
	public String memberLogin(MemberDTO memberDTO, HttpSession session)throws Exception{
		memberDTO = memberService.memberLogin(memberDTO);
		System.out.println(memberDTO);
		
		session.setAttribute("member",memberDTO);
		
		return "redirect:../";
	}
	
	@RequestMapping("memberJoin")
	public void memberJoin()throws Exception{}
	
	@RequestMapping("memberJoinCheck")
	public void memberJoinCheck()throws Exception{}
	
	@RequestMapping(value="memberJoin", method = RequestMethod.POST)
	public String memberJoin(MemberDTO memberDTO, MultipartFile avatar, HttpSession session ,Model model)throws Exception{
		int result = memberService.memberJoin(memberDTO, avatar, session);
		System.out.println(avatar.getName()); //파라미터명
		System.out.println(avatar.getOriginalFilename()); //upload 할 때 파일명
		System.out.println(avatar.getSize()); //파일의 크기(byte)
		System.out.println(avatar.isEmpty()); //파일의 존재유무 -> 있으면 false, 없으면 true
		
		
		String message = "회원가입 실패";
		String path = "./memberJoin";
		
		if(result>0) {
			message = "회원 가입 성공";
			path="../";
		}
		
		model.addAttribute("msg", message);
		model.addAttribute("path", path);
		return "common/commonResult";
	}

}