<%@page import="java.sql.ResultSet"%>
<%@page import="com.itwillbs.member.memberBean"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.mysql.jdbc.interceptors.SessionAssociationInterceptor"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
  
  String id =(String) session.getAttribute("id");
  
  if (id == null) {
		System.out.println("[info.jsp] : 아이디없음 -> 로그인페이지이동");
		response.sendRedirect("loginForm.jsp");
	}
  
  String DRIVER = "com.mysql.jdbc.Driver";
  String DBURL = "jdbc:mysql://localhost:3306/jspdb";
  String DBID = "root";
  String DBPW = "1234";
  
  
  Class.forName(DRIVER);
  System.out.println("드라이버 로드 성공");
  
  Connection conn = DriverManager.getConnection(DBURL, DBID, DBPW);
  
  String sql = "select * from itwill_member where id=? ";
  
  PreparedStatement pstmt = conn.prepareStatement(sql);
  
  pstmt.setString(1, id);
  
  ResultSet rs = pstmt.executeQuery();
  
  memberBean mb = null;
  if(rs.next()){
	  mb = new memberBean();
		mb.setId(rs.getString("id"));
		mb.setPw(rs.getString("pw"));
		mb.setName(rs.getString("name"));
		mb.setAge(rs.getInt("age"));
		mb.setGender(rs.getString("gender"));
		mb.setEmail(rs.getString("email"));
		mb.setRegdate(rs.getTimestamp("regdate"));
		
	  System.out.println("SQL구문 실행완료!");
	  System.out.println("저장된 회원정보 : " +mb);
	  
  }
  
  
  %>

  <h1>WebContent/member/updateForm.jsp</h1>
  
  <h2> 회원가입 </h2>
  <!-- 아이디,비밀번호, 이름,나이, 성별(라디오버튼),이메일 -->
  
  
  <fieldset>
    <legend> 아이티윌 회원가입 페이지 </legend>
    <% if(mb != null) {%>
    <form action="updatePro.jsp" method="post">
    <!-- input  태그
    	readonly 속성 : 값 변경 X , 데이터 전송(submit) O
    	disabled 속성 : 값 변경 X , 데이터 전송 X
    
     -->
      아이디 : <input type="text" name="id" value="<%=mb.getId()%>" readonly="readonly"><br>
      비밀번호 : <input type="password" name="pw" placeholder="비밀번호를 입력하세요."><br>
      <hr>
      이름 : <input type="text" name="name" value="<%=mb.getName()%>"><br>
      나이 : <input type="number" name="age" value="<%=mb.getAge()%>"><br>
      성별 : <input type="radio" name="gender" value="남"
        <% 
         if(mb.getGender().equals("남")){
        	 %>
        	 checked="checked"
        	 <%
         }
        %>        
      > 남
      <input type="radio" name="gender" value="여"
         <% 
         if(mb.getGender().equals("여")){
        	 %>
        	 checked
        	 <%
         }
        %> 
      
      > 여  <br>
      이메일 : <input type="email" name="email" value="<%=mb.getEmail()%>"><br>
      <hr>
     <input type="submit" value="완료">           
    
    </form>  
    <% } %>
  </fieldset>
  
  
  
  
  
  
  
  
  

</body>
</html>