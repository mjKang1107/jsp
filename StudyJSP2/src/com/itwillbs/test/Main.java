package com.itwillbs.test;

public class Main {
	
	 static void showInfo(String name,String tel){
		System.out.println("이름 : " + name + " 전화번호 : " +tel);
		
		
	}
	
	static void showScore(int kor, int eng, int math){
		System.out.println("총합 : " +(kor+eng+math)+ " 평균 : " +((kor+eng+math)/3.0));
		
	}
	
	static void showTotal(itwillBean itb){
		System.out.println("이름 : " + itb.getName()+ " 전화번호 : " +itb.getTel());
		System.out.println("총합 : " +(itb.getKor() + itb.getEng() + itb.getMath())+
				"평균 : " +((itb.getKor() + itb.getEng()+itb.getMath())/3.0));
	}
	
	
	
	
	public static void main(String[] args){
		
		itwillBean ib = new itwillBean();
		
		System.out.println(ib.toString());
		System.out.println(ib);
		System.out.println("---------------------");
		
		
		//객체 생성없이 학생 한명의 정보를 생성 후 
		//학생의 정보 출력, 점수의 총합, 평균 계산 후 출력
		
		String name = "홍길동";
		String tel = "010-1234-1234";
		int kor = 82;
		int eng = 77;
		int math = 86;
		
		System.out.println("이름 : " + name +" 전화번호 : " +tel);
		System.out.println("총합 : " +(kor+eng+math)+" 평균 : " +((kor+eng+math)/3.0));
																//평균은 실수로 나누자..
		//메서드 생성 showInfo(): 이름 , 전화번호 출력
		//  	  showScore() : 총합, 평균 출력
		showInfo(name, tel);
		
		Main m = new Main();
		m.showScore(kor, eng, math);
		
		//메서드 생성 showTotal() -> itwillBean 객체를 사용해서 
		//사용자 정보+ 점수 정보(총점, 평균)을 출력
		itwillBean kang = new itwillBean();
		
		kang.setName("강학생");
		kang.setTel("010-1234-1465");
		kang.setKor(99);
		kang.setEng(88);
		kang.setMath(66);
		
		m.showTotal(kang);
		
		System.out.println("----------------------------");
		
		//계산전용 객체 Calc 생성
				//총점 (SUM)- 계산 후 리턴, 평균(AVG) - 계산 후 출력
				//해당 메서드를 오버로딩해서 점수3개 , 객체정보를 사용하는 메서드 구현
				
		
		Calc c = new Calc();
		
		System.out.println(c.SUM(kor, eng, math));
		System.out.println(c.SUM(kang));
		
		c.AVG(kor, eng, math);
		c.AVG(kang);
		
		
	}															
	
}
