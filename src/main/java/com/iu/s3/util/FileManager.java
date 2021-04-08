package com.iu.s3.util;

import java.io.File;
import java.util.Calendar;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileManager {
	
	public String save(String name, MultipartFile multipartFile, HttpSession session)throws Exception{
		//1. 경로 설정
		String path = session.getServletContext().getRealPath("resources/upload/"+name); //운영체제에다가 이경로를 저장해줘요
		System.out.println(path); 
		
		File file = new File(path);
		System.out.println(file.exists());
		
		if(!file.exists()) {
	         file.mkdir();
	    }
		
		//2. 저장할 파일명
		String fileName="";
		
		//1. 시간
//		Calendar ca = Calendar.getInstance();
//		long time = ca.getTimeInMillis();
//		fileName = time+"_"+multipartFile.getOriginalFilename();
		
		//자바에서 제공하는 api를 이용, 중복되지 않는 문자열을 받아옴
		fileName = UUID.randomUUID().toString()+"_"+multipartFile.getOriginalFilename();
		
		//3. HDD에 저장 (해당경로, 파일이름)
		file = new File(file, fileName);
		
		//a FileCopyUtils
//		FileCopyUtils.copy(multipartFile.getBytes(), file);

		//b. multipartFile
		multipartFile.transferTo(file);
		
		return fileName;
	}
	
	
	
	
	
	public void saveUseTransfer(MultipartFile multipartFile, File file)throws Exception{
		multipartFile.transferTo(file);
	}
	
	public void saveUseCopy(MultipartFile multipartFile, File file)throws Exception{
		FileCopyUtils.copy(multipartFile.getBytes(), file);
	}
	
	public String makeUUIDFileName()throws Exception{
		return UUID.randomUUID().toString();
	}
	
	public String makeTimeFileName()throws Exception{
		Calendar ca = Calendar.getInstance();
		long time = ca.getTimeInMillis();
		return String.valueOf(time);
	}
	
	public File makePath(HttpSession session)throws Exception{
		//1. 저장할 폴더 지정 resources/upload/member
		//2. os에서 인식할 수 있는 실제 경로 찾기
		//jsp : application - server : ServletContext 
		
		String path = session.getServletContext().getRealPath("resources/upload/member"); //운영체제에다가 이경로를 저장해줘요
		System.out.println(path); 
		
		//3. 실제 경로에 폴더가 없으면 파일 저장시 에러 발생
		File file = new File(path);
		System.out.println(file.exists());
		
		if(!file.exists()) {
	         file.mkdir();
	      }
		
		return file;
	}
}
