package com.itwillbs.board;

import java.sql.Date;

public class BoardBean {
	//itwill_board 테이블의 정보를 저장하는 자바빈 객체
	//BoardDTO(Data Transfer Object) : 게시판정보를 옮기는 객체
	
	private int num;
	private String name;
	private String pass;
	private String subject;
	private String content;
	private String readcount;
	private int re_ref;
	private int re_lef;
	private int re_seq;
	private Date date;
	private String ip;
	private String file;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getReadcount() {
		return readcount;
	}
	public void setReadcount(String readcount) {
		this.readcount = readcount;
	}
	public int getRe_ref() {
		return re_ref;
	}
	public void setRe_ref(int re_ref) {
		this.re_ref = re_ref;
	}
	public int getRe_lef() {
		return re_lef;
	}
	public void setRe_lef(int re_lef) {
		this.re_lef = re_lef;
	}
	public int getRe_seq() {
		return re_seq;
	}
	public void setRe_seq(int re_seq) {
		this.re_seq = re_seq;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	@Override
	public String toString() {
		return "BoardBean [num=" + num + ", name=" + name + ", pass=" + pass + ", subject=" + subject + ", content="
				+ content + ", readcount=" + readcount + ", re_ref=" + re_ref + ", re_lef=" + re_lef + ", re_seq="
				+ re_seq + ", date=" + date + ", ip=" + ip + ", file=" + file + "]";
	}
	
	
	
	
	
	
	
	
	
}