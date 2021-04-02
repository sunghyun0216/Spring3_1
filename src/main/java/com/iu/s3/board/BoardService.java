package com.iu.s3.board;

import java.util.List;

import com.iu.s3.util.Pager;

public interface BoardService {
	
	
	public List<BoardDTO> getList(Pager pager)throws Exception;
	
}
