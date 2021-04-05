package com.iu.s3.board.qna;

import com.iu.s3.board.BoardDTO;

public class QnaDTO extends BoardDTO{

	private long ref;
	private long step;
	private long dept;
	public long getRef() {
		return ref;
	}
	public void setRef(long ref) {
		this.ref = ref;
	}
	public long getStep() {
		return step;
	}
	public void setStep(long step) {
		this.step = step;
	}
	public long getDept() {
		return dept;
	}
	public void setDept(long dept) {
		this.dept = dept;
	}
	
	
	
	
	
}
