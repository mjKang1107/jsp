package com.itwillbs.test;
//계산전용 객체 Calc 생성
		//총점 (SUM)- 계산 후 리턴, 평균(AVG) - 계산 후 출력
		//해당 메서드를 오버로딩해서 점수3개 , 객체정보를 사용하는 메서드 구현
		



public class Calc {

	public int SUM(int kor, int eng, int math){
		return kor+eng+math;
		
	}
	
	public int SUM(itwillBean ib){
		return ib.getKor()+ib.getEng()+ib.getMath();
		
	}
	
	
	public void AVG(int kor, int eng, int math){
		System.out.println("평균 : " +((kor+eng+math)/3.0));
		
		
	}
	
	public void AVG(itwillBean ib){
		System.out.println("평균 : " +(SUM(ib)/3.0));
	}
	
	
	
	
}
