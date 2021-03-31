<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h1>WebContent/JSP1/test2.html</h1>
  
  <%
    // 스크립틀릿 작성 -java코드
    // 문자열 배열- 4칸
    // "java","jsp","web","DB"
 
 
      String[] strArr = {"java","jsp","web","DB"};
    
    String[] strArr3 = new String[]{"java","jsp","web","DB"};
    
    // strArr 배열의 모든 요소의 값을 콘솔창(이클립스)에 출력
    
    for(int i =0;i<strArr.length;i++){
    	System.out.println("strArr["+i+"] = "+strArr[i]);
    }
    
    // 확장for / for-each
    for(String s :strArr){
    	System.out.println(s);
    } 
    
    // 화면에 출력 -> out.print() / out.println()사용
    // html 코드로 작성(줄바꾸기 할때 "<br>" 태그)
    // out.print("html 코드 작성")
    for(int i =0;i<strArr.length;i++){
    	out.println("strArr["+i+"] = "+strArr[i]+"<br>");
    }
  
    // 표현식을 사용해서 화면출력
    for(int i =0;i<strArr.length;i++){
    	%>
    	<!-- Html -->
    	<!-- jsp 표현식은 html 코드에 작성 -->
    	<hr>
    	strArr[<%=i %>] = <%=strArr[i] %>
    	
    	<!-- Html -->
		<%    	
    	
    }
  %>
  
  <hr>
  
  <h3> 테이블 생성 </h3>
  <!-- 번호 1~4, 과목이름, 과목내용(과목이름+번호) 
  	java코드 : strArr 배열의 요소를 html 테이블에 출력
  -->
  
  
  <table border="1">
  <tr>
  	<th>번호</th>
  	<th>과목이름</th>
  	<th>과목내용(과목이름+번호)</th>
  </tr>
  
  <tr>
  	<td><%=1 %></td>
  	<td><%=strArr[0] %></td>
  	<td><%=strArr[0] %><%=1 %></td>
  </tr>
  
  <tr>
  	<td><%=2 %></td>
  	<td><%=strArr[1] %></td>
  	<td><%=strArr[1] %><%=2 %></td>
  </tr>
  
  <tr>
  	<td><%=3 %></td>
  	<td><%=strArr[2] %></td>
  	<td><%=strArr[2] %><%=3 %></td>
  </tr>
  
  <tr>
  	<td><%=4 %></td>
  	<td><%=strArr[3] %></td>
  	<td><%=strArr[3] %><%=4 %></td>
  </tr>
  
  </table>
  
  
  
  
</body>
</html>