/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.68
 * Generated at: 2021-11-01 14:24:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class studentregister_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/bootstrap.css\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Website CSS style -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/main.css\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Website Font style -->\r\n");
      out.write("\t    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- Google Fonts -->\r\n");
      out.write("\t\t<link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'>\r\n");
      out.write("\t\t<link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>\r\n");
      out.write("\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write(" \r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("/*\r\n");
      out.write("/* Created by Filipe Pina\r\n");
      out.write(" * Specific styles of signin, register, component\r\n");
      out.write(" */\r\n");
      out.write("/*\r\n");
      out.write(" * General styles\r\n");
      out.write(" */\r\n");
      out.write("#playground-container {\r\n");
      out.write("    height: 500px;\r\n");
      out.write("    overflow: hidden !important;\r\n");
      out.write("    -webkit-overflow-scrolling: touch;\r\n");
      out.write("}\r\n");
      out.write("body, html{\r\n");
      out.write("     height: 100%;\r\n");
      out.write(" \tbackground-repeat: no-repeat;\r\n");
      out.write(" \tbackground:url(https://i.ytimg.com/vi/4kfXjatgeEU/maxresdefault.jpg);\r\n");
      out.write(" \tfont-family: 'Oxygen', sans-serif;\r\n");
      out.write("\t    background-size: cover;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".main{\r\n");
      out.write(" \tmargin:50px 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h1.title { \r\n");
      out.write("\tfont-size: 50px;\r\n");
      out.write("\tfont-family: 'Passion One', cursive; \r\n");
      out.write("\tfont-weight: 400; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("hr{\r\n");
      out.write("\twidth: 10%;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-group{\r\n");
      out.write("\tmargin-bottom: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("label{\r\n");
      out.write("\tmargin-bottom: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input,\r\n");
      out.write("input::-webkit-input-placeholder {\r\n");
      out.write("    font-size: 11px;\r\n");
      out.write("    padding-top: 3px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".main-login{\r\n");
      out.write(" \tbackground-color: #fff;\r\n");
      out.write("    /* shadows and rounded borders */\r\n");
      out.write("    -moz-border-radius: 2px;\r\n");
      out.write("    -webkit-border-radius: 2px;\r\n");
      out.write("    border-radius: 2px;\r\n");
      out.write("    -moz-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\r\n");
      out.write("    -webkit-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\r\n");
      out.write("    box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".form-control {\r\n");
      out.write("    height: auto!important;\r\n");
      out.write("padding: 8px 12px !important;\r\n");
      out.write("}\r\n");
      out.write(".input-group {\r\n");
      out.write("    -webkit-box-shadow: 0px 2px 5px 0px rgba(0,0,0,0.21)!important;\r\n");
      out.write("    -moz-box-shadow: 0px 2px 5px 0px rgba(0,0,0,0.21)!important;\r\n");
      out.write("    box-shadow: 0px 2px 5px 0px rgba(0,0,0,0.21)!important;\r\n");
      out.write("}\r\n");
      out.write("#button {\r\n");
      out.write("    border: 1px solid #ccc;\r\n");
      out.write("    margin-top: 28px;\r\n");
      out.write("    padding: 6px 12px;\r\n");
      out.write("    color: #666;\r\n");
      out.write("    text-shadow: 0 1px #fff;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    -moz-border-radius: 3px 3px;\r\n");
      out.write("    -webkit-border-radius: 3px 3px;\r\n");
      out.write("    border-radius: 3px 3px;\r\n");
      out.write("    -moz-box-shadow: 0 1px #fff inset, 0 1px #ddd;\r\n");
      out.write("    -webkit-box-shadow: 0 1px #fff inset, 0 1px #ddd;\r\n");
      out.write("    box-shadow: 0 1px #fff inset, 0 1px #ddd;\r\n");
      out.write("    background: #f5f5f5;\r\n");
      out.write("    background: -moz-linear-gradient(top, #f5f5f5 0%, #eeeeee 100%);\r\n");
      out.write("    background: -webkit-gradient(linear, left top, left bottom, color-stop(0%, #f5f5f5), color-stop(100%, #eeeeee));\r\n");
      out.write("    background: -webkit-linear-gradient(top, #f5f5f5 0%, #eeeeee 100%);\r\n");
      out.write("    background: -o-linear-gradient(top, #f5f5f5 0%, #eeeeee 100%);\r\n");
      out.write("    background: -ms-linear-gradient(top, #f5f5f5 0%, #eeeeee 100%);\r\n");
      out.write("    background: linear-gradient(top, #f5f5f5 0%, #eeeeee 100%);\r\n");
      out.write("    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#f5f5f5', endColorstr='#eeeeee', GradientType=0);\r\n");
      out.write("}\r\n");
      out.write(".main-center{\r\n");
      out.write(" \tmargin-top: 30px;\r\n");
      out.write(" \tmargin: 0 auto;\r\n");
      out.write(" \tmax-width: 400px;\r\n");
      out.write("    padding: 10px 40px;\r\n");
      out.write("\tbackground:#009edf;\r\n");
      out.write("\t    color: #FFF;\r\n");
      out.write("    text-shadow: none;\r\n");
      out.write("\t-webkit-box-shadow: 0px 3px 5px 0px rgba(0,0,0,0.31);\r\n");
      out.write("-moz-box-shadow: 0px 3px 5px 0px rgba(0,0,0,0.31);\r\n");
      out.write("box-shadow: 0px 3px 5px 0px rgba(0,0,0,0.31);\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("span.input-group-addon i {\r\n");
      out.write("    color: #009edf;\r\n");
      out.write("    font-size: 17px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-button{\r\n");
      out.write("\tmargin-top: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-register{\r\n");
      out.write("\tfont-size: 11px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write(".btn {\r\n");
      out.write("  background: #267cb5;\r\n");
      out.write("  background-image: -webkit-linear-gradient(top, #267cb5, #2980b9);\r\n");
      out.write("  background-image: -moz-linear-gradient(top, #267cb5, #2980b9);\r\n");
      out.write("  background-image: -ms-linear-gradient(top, #267cb5, #2980b9);\r\n");
      out.write("  background-image: -o-linear-gradient(top, #267cb5, #2980b9);\r\n");
      out.write("  background-image: linear-gradient(to bottom, #267cb5, #2980b9);\r\n");
      out.write("  -webkit-border-radius: 26;\r\n");
      out.write("  -moz-border-radius: 26;\r\n");
      out.write("  border-radius: 26px;\r\n");
      out.write("  font-family: Arial;\r\n");
      out.write("  color: #ffffff;\r\n");
      out.write("  font-size: 20px;\r\n");
      out.write("  padding: 10px 20px 10px 20px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("btn:hover {\r\n");
      out.write("  background: #3cb0fd;\r\n");
      out.write("  background-image: -webkit-linear-gradient(top, #3cb0fd, #3498db);\r\n");
      out.write("  background-image: -moz-linear-gradient(top, #3cb0fd, #3498db);\r\n");
      out.write("  background-image: -ms-linear-gradient(top, #3cb0fd, #3498db);\r\n");
      out.write("  background-image: -o-linear-gradient(top, #3cb0fd, #3498db);\r\n");
      out.write("  background-image: linear-gradient(to bottom, #3cb0fd, #3498db);\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<script>  \r\n");
      out.write("function validateForm() {\r\n");
      out.write("  let x = document.forms[\"myForm\"][\"fname\"].value;\r\n");
      out.write("  if (x == \"\") {\r\n");
      out.write("    alert(\"Name must be filled out\");\r\n");
      out.write("    return false;\r\n");
      out.write("  }\r\n");
      out.write("}  \r\n");
      out.write("</script> \r\n");
      out.write("<body>\r\n");
      out.write("<form name=\"myForm\"  action=\"studentregister\" method=\"post\"  onclick=\"return validateForm()\">\r\n");
      out.write("<center>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row main\">\r\n");
      out.write("\t\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t               <div class=\"panel-title text-center\">\r\n");
      out.write("\r\n");
      out.write("\t               \t</div>\r\n");
      out.write("\t            </div> \r\n");
      out.write("\t\t\t\t<div class=\"main-login main-center\">\r\n");
      out.write("\t\t\t\t\t<form class=\"form-horizontal\" method=\"post\" action=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"Name\" class=\"cols-sm-2 control-label\">Name</label>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-user fa\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"Name\" id=\"a1\"  placeholder=\"Enter Your Name\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"number\" class=\"cols-sm-2 control-label\">Number</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-phone\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("                                    <input type=\"number\" class=\"form-control\" name=\"Contact\" id=\"Contact\"  placeholder=\"Enter Your Number\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"date\" class=\"cols-sm-2 control-label\">Date</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-calendar\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("                                    <input type=\"date\" class=\"form-control\" name=\"DOB\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"Email\" class=\"cols-sm-2 control-label\">Email</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-envelope fa\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"Email\" id=\"email\"  placeholder=\"Your Email\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("\t<label for=\"Gender\" class=\"cols-sm-2 control-label\">Gender</label>\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"Gender\" class=\"cols-sm-2 control-label\">Gender</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-genderless\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("                                   <table>\r\n");
      out.write("                                   <tr>\r\n");
      out.write("                                    <td ><input type=\"radio\" name=\"Gender\" value=\"male\">Male</td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                    <td>\t<input type=\"radio\" name=\"Gender\" value=\"Female\">Female</td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    </table>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"Branch\" class=\"cols-sm-2 control-label\">Branch</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-university\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select class=\"form-control\" name=\"Branch\" id=\"Branch\" >\r\n");
      out.write("                                    <option>-select-</option>\r\n");
      out.write("                                    <option>CSE</option>\r\n");
      out.write("                                    <option>CIVIL</option>\r\n");
      out.write("                                    <option>MECH</option>\r\n");
      out.write("                                    <option>EC</option>\r\n");
      out.write("                                  \r\n");
      out.write("                                    \r\n");
      out.write("                                    </select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"semister\" class=\"cols-sm-2 control-label\">semister</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-university\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<select class=\"form-control\" name=\"semister\" id=\"semister\" >\r\n");
      out.write("                                    <option>-select-</option>\r\n");
      out.write("                                    <option>1st</option>\r\n");
      out.write("                                    <option>2nd</option>\r\n");
      out.write("                                    <option>3rd</option>\r\n");
      out.write("                                    <option>4th</option>\r\n");
      out.write("                                    <option>5th</option>\r\n");
      out.write("                                    <option>6th</option>\r\n");
      out.write("                                    <option>7th</option>\r\n");
      out.write("                                    <option>8th</option>\r\n");
      out.write("                                    </select>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"USN\" class=\"cols-sm-2 control-label\">USN</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-laptop\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"USN\" id=\"USN\"  placeholder=\"Enter Your USN\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"Address\" class=\"cols-sm-2 control-label\">Address</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-home\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"Address\" id=\"Address\"  placeholder=\"Enter Your Address\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"Username\" class=\"cols-sm-2 control-label\">Username</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-user fa\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"Username\" id=\"Username\"  placeholder=\"Enter Your UserName\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"Password\" class=\"cols-sm-2 control-label\">Password</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-eye-slash\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("                                    <input type=\"Password\" class=\"form-control\" name=\"Password\" id=\"Password\"  placeholder=\"Enter Your Password\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"confirmpassword\" class=\"cols-sm-2 control-label\">confirm password</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-eye-slash\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("                                    <input type=\"password\" class=\"form-control\" name=\"confirmpassword\" id=\" confirm password\"  placeholder=\"Re Enter Your Password\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("<input class=\"btn\" type=\"submit\" value=\"Register\" >\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"assets/js/bootstrap.js\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</center>\r\n");
      out.write("\r\n");
      out.write("\t\t</form >\r\n");
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