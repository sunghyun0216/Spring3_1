package com.iu.s3.board.qna;

import java.util.List;

import com.iu.s3.board.BoardDTO;
import com.iu.s3.util.Pager;

public interface QnaDAO {
	//상수, 추상 메서드
	//접근 지정자는 무조건 public abstract
	
	
	//list
	public List<BoardDTO> getList(Pager pager)throws Exception;
	
	
}
