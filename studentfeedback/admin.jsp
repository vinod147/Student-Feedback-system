<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body{
	background-image: url("bg/business-g893a9a25e_1920.jpg")
}
.error-container {
		height: 100vh !important;
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
		font-family: montserrat, sans-serif;
		
	}

	.big-text {
		font-size: 200px;
		font-weight: 900;
		font-family: sans-serif;
		background: url(https://cdn.pixabay.com/photo/2018/05/30/15/39/thunderstorm-3441687_960_720.jpg) no-repeat;
		-webkit-background-clip: text;
		-webkit-text-fill-color: transparent;
		background-size: cover;
		background-position: center;
	}

	.small-text {
		font-family: montserrat, sans-serif;
		color: rgb(0, 0, 0);
		font-size: 24px;
		font-weight: 700;
		text-transform: uppercase;
	}




	/* Style the search field */
	/*form.example input[type=text] {
  padding: 10px;
  font-size: 17px;
  border: 1px solid grey;
  float: left;
  width: 80%;

}
	*/

	.form-group {
		display: flex;
		/* border: 1px #53a0e4 solid;
		border-radius:30px;
		overflow: hidden;*/
	}

	/*	
	.form-group:focus-within{
	   border: 1px green solid;
	}
	*/

	/*	input:focus + .control-label
	*/
	.form-control {
		overflow: hidden;
		background: #fff;
		border: 1px #53a0e4 solid;
		border-right: none;
		border-radius: 25px 0px 0px 25px;
		font-size: 1rem;
	}

	.form-control:focus {
		border-color: #61b045;
		box-shadow: none;
	}


	/* Style the submit button */
	form .search-btn {
		all: unset;
		width: 15%;
		padding: 10px;
		background: #1e50e2;
		color: white;
		font-size: 17px;
		border: 1px #1e50e2 solid;
		border-left: none;
		/* Prevent double borders */
		border: 1px #53a0e4 solid;
		border-radius: 0px 25px 25px 0px;
		cursor: pointer;
	}

	form .search-btn:hover {
		background: #0b7dda;
	}

.button {
	color:	#fff;
	width: 300px;
	padding: 12px 36px;
	font-weight: 600;
	border: none;
	position: relative;
	font-family: 'Raleway', sans-serif;
	display: inline-block;
	text-transform: uppercase;
	-webkit-border-radius: 90px;
	-moz-border-radius: 90px;
	border-radius: 90px;
	margin: 2px;
	margin-top: 2px;
	background-image: linear-gradient(to right, #09b3ef 0%, #1e50e2 51%,#09b3ef 100%);
	background-size: 200% auto;
	flex: 1 1 auto;
	text-decoration: none;

}


.button:hover,
.button:focus {
	color:	#ffffff;
	background-position: right center;
	-webkit-box-shadow: 0px 5px 15px 0px rgba(0, 0, 0, 0.1);
	-moz-box-shadow: 0px 5px 15px 0px rgba(0, 0, 0, 0.1);
	box-shadow: 0px 5px 15px 0px rgba(0, 0, 0, 0.1);
	text-decoration: none;
}
</style>
<body>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
<div class="container error-container">
	<div class="row  d-flex align-items-center justify-content-center">
		<div class="col-md-12 text-center">
		</div>
<a href="viewstudent.jsp"><input type="button" name="viewstudent" value="View Student" class="button button-dark-blue iq-mt-15 text-center"/></a><br><br>
<a href="viewfaculty.jsp"><input type="button" name="viewfaculty" value="View Faculty" class="button button-dark-blue iq-mt-15 text-center"/></a><br><br>

		</div>
	</div>
</div>
</body>
</html>