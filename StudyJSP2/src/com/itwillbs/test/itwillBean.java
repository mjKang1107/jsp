package com.itwillbs.test;
// 보통 패키지는 도메인주소를 반대로 해서 만든다..

public class itwillBean {
	private String name;
	private String tel;
	private int kor;
	private int eng;
	private int math;
	
	//오버로딩된 생성자가 없을경우에만 컴파일러가 자동으로 생성- 기본생성자
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	@Override
	public String toString() {
		return "itwillBean [name=" + name + ", tel=" + tel + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	
	
	
	
}
