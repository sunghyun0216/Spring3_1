package com.iu.s3.account;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
	
	@Autowired
	private AccountDAO accountDAO;
	
	public int setInsert(AccountDTO accountDTO)throws Exception{
		
		//계좌번호는 절대 중복이 되면안됨 1.Random(우연치 않게 중복 숫자가 나올 수 있음, 절대중복이 나올수없는 확신으로 해라) 
		//2.Time  --> 시간과 날짜를 다루는 calendar 
		//3. java API
		//return accountDAO.setInsert(accountDTO);
		
		Calendar ca = Calendar.getInstance(); //추상객체라 이렇게 뽑아냄
		long time =ca.getTimeInMillis(); //현재시간을 롱타입으로 바꿔줌
		
		System.out.println(time);
		
		String t = time+""; //private+string=string타입이됨
		t = String.valueOf(time);
		
		String result = t.substring(0, 4)+"-";  //1616-
		result = result + t.substring(4, 8)+"-"; //1616-7197
		result = result + t.substring(8); //1616-7197-39961
		
		System.out.println(result);
		
		//SimpleDateFormat
		SimpleDateFormat sd = new SimpleDateFormat("ddyyyyMM-HHmmss-S");
		String r = sd.format(ca.getTime());
		System.out.println(r);
		
		String name = UUID.randomUUID().toString(); //uuid : 중복없는 특정한 값을 준다.
		System.out.println(name);
		
		accountDTO.setAccountNumber(t);
		
		return accountDAO.setInsert(accountDTO);
	}
	
	public List<AccountDTO> getList(AccountDTO accountDTO)throws Exception{
		return accountDAO.getList(accountDTO);
	}
	
	
	
}
