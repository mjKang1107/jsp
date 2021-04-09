/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.63
 * Generated at: 2021-04-08 02:36:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.JSP5;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class insertTest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("java.sql.Statement");
    _jspx_imports_classes.add("java.sql.PreparedStatement");
    _jspx_imports_classes.add("java.sql.DriverManager");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>  \r\n");
      out.write("    <h1>WebContent/JSP5/insertTest.jsp</h1>\r\n");
      out.write("    \r\n");
      out.write("    ");

    	String name = "itwill";
    	String gender = "남";
    	int age = 30;
    	String jumin = "900101-123131";
    
    
      final String DRIVER= "com.mysql.jdbc.Driver";
      final String DBURL = "jdbc:mysql://localhost:3306/jspdb";
      final String DBID = "root";
      final String DBPW = "1234";
    
     // 1단계 드라이버 로드
     Class.forName(DRIVER);
     
     System.out.println(" 드라이버 로드 성공! ");
     // 2단계 디비 연결
     
     Connection conn 
         = DriverManager.getConnection(DBURL, DBID, DBPW);
     
     System.out.println(" 디비연결 성공! "+conn);
     
     System.out.println(" 디비연결 완료 SQL쿼리 사용전 준비 상태 ");
     
     //3단계 sql 구문 작성 
     //          & statement 객체 생성(->preparedstatement 변경예정)
     
 //    String sql 
 //    ="insert into itwill_member (name,gender,age,jumin) values('테스트','남',10,'900110-1111111')";
 //    String sql 
 //    ="insert into itwill_member (name,gender,age,jumin) values('"+name+"','"+gender+"',"+age+",'"+jumin+"')";
     String sql 
     ="insert into itwill_member (name,gender,age,jumin) values(?,?,?,?)";
     // Statement : SQL 구문을 실행하는 객체 
     //PreparedStatement : SQL 구문을 실행하는 객체 
     //-> 쿼리문을 실행할 준비가 되어있는 상태(처리속도 우수, 보안상 안전)
     
 //    Statement stmt = conn.createStatement();
     
     PreparedStatement pstmt = conn.prepareStatement(sql);
     
     // ? 채우기
    // XXXXX는 컬럼의 데이터 타입에 따라서 변경		 
    //pstmt.setXXXXX(?위치, 저장할 값));
    // String sql 
    // ="insert into itwill_member (name,gender,age,jumin) values(?,?,?,?)";
    //-> 물음표 갯수와 맞아야 함
    pstmt.setString(1, name);
    pstmt.setString(2, gender);
    pstmt.setInt(3, age);
    pstmt.setString(4, jumin);
    		 
     // 4단계 SQL 구문을 실행
    // stmt.executeUpdate(sql);
     
   // pstmt.executeQuery();
   //=> select 구문 실행시  -> 값을 바꾸지 않는 가지고오기만하는 정의어
   // pstmt.executeUpdate(); 
   //=> insert, update, delete 구문 실행시 -> 값을 바꾸는 조작어
    
    pstmt.executeUpdate(); 
     
     System.out.println(" 디비 정보 저장완료! ");  
     
    
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}