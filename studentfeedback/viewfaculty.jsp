<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@page import="java.sql.*"%>
<%@page import="sun.misc.BASE64Encoder"%>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<style>
.styled-table {
    border-collapse: collapse;
    margin: 25px 0;
    font-size: 0.9em;
    font-family: sans-serif;
    min-width: 400px;
    box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
}
.styled-table thead tr {
    background-color: #009879;
    color: #ffffff;
    text-align: left;
}
.styled-table th,
.styled-table td {
    padding: 12px 15px;
}
.styled-table tbody tr {
    border-bottom: 1px solid #dddddd;
}

.styled-table tbody tr:nth-of-type(even) {
    background-color: #f3f3f3;
}

.styled-table tbody tr:last-of-type {
    border-bottom: 2px solid #009879;
}
.styled-table tbody tr.active-row {
    font-weight: bold;
    color: #009879;
}
</style>
<body >
<center><br><br>
<div class="table-responsive" id="sailorTableArea">
    <table id="sailorTable" class="table table-striped table-bordered" width="100%">

<marquee><h1 style="color:skyblue" class="p1">STUDENTS DATA</h1></marquee><br>
<table class="styled-table">
<thead>
<tr>
	<th >Name</th>
	<th >Contact</th>
	<th >Branch</th>
	<th >semister</th>
	<th >FacultyId</th>
	<th >Username</th>
	<th >Password</th>
	<th >confirmpassword</th>
	
</tr>
	</thead>

<%

try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/feedback","root","root");
	Statement st = con.createStatement();
	
	
	ResultSet res = st.executeQuery("select *from faculty");
	while(res.next()){
		byte[] imageBytes = res.getBytes(8);
		BASE64Encoder enc = new BASE64Encoder();
		String img = enc.encode(imageBytes);
		System.out.println(img);
%>
	
	<tr>
		<td ><%=res.getString(1) %></td>
		<td ><%=res.getString(2) %></td>
		<td><%=res.getString(3) %></td>
		<td ><%=res.getString(4) %></td>
		<td ><%=res.getString(5) %></td>
		<td ><%=res.getString(6) %></td>
		<td ><%=res.getString(7) %></td>
		<td ><%=res.getString(8) %></td>
		
		
	
	
		</tr>
<%	
	}


}
catch(Exception e){
System.out.println(e);

	
		}

%>





</center>
</body>
</html>