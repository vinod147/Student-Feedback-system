<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<!DOCTYPE html>
<html lang="en">
	<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" type="text/css" href="assets/css/bootstrap.css">

		<!-- Website CSS style -->
		<link rel="stylesheet" type="text/css" href="assets/css/main.css">

		<!-- Website Font style -->
	    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
		
		<!-- Google Fonts -->
		<link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'>
		<link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>

<title>Insert title here</title>
 
</head>
<style>
/*
/* Created by Filipe Pina
 * Specific styles of signin, register, component
 */
/*
 * General styles
 */
#playground-container {
    height: 500px;
    overflow: hidden !important;
    -webkit-overflow-scrolling: touch;
}
body, html{
     height: 100%;
 	background-repeat: no-repeat;
 	background:url(https://i.ytimg.com/vi/4kfXjatgeEU/maxresdefault.jpg);
 	font-family: 'Oxygen', sans-serif;
	    background-size: cover;
}

.main{
 	margin:50px 15px;
}

h1.title { 
	font-size: 50px;
	font-family: 'Passion One', cursive; 
	font-weight: 400; 
}

hr{
	width: 10%;
	color: #fff;
}

.form-group{
	margin-bottom: 15px;
}

label{
	margin-bottom: 15px;
}

input,
input::-webkit-input-placeholder {
    font-size: 11px;
    padding-top: 3px;
}

.main-login{
 	background-color: #fff;
    /* shadows and rounded borders */
    -moz-border-radius: 2px;
    -webkit-border-radius: 2px;
    border-radius: 2px;
    -moz-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    -webkit-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);

}
.form-control {
    height: auto!important;
padding: 8px 12px !important;
}
.input-group {
    -webkit-box-shadow: 0px 2px 5px 0px rgba(0,0,0,0.21)!important;
    -moz-box-shadow: 0px 2px 5px 0px rgba(0,0,0,0.21)!important;
    box-shadow: 0px 2px 5px 0px rgba(0,0,0,0.21)!important;
}
#button {
    border: 1px solid #ccc;
    margin-top: 28px;
    padding: 6px 12px;
    color: #666;
    text-shadow: 0 1px #fff;
    cursor: pointer;
    -moz-border-radius: 3px 3px;
    -webkit-border-radius: 3px 3px;
    border-radius: 3px 3px;
    -moz-box-shadow: 0 1px #fff inset, 0 1px #ddd;
    -webkit-box-shadow: 0 1px #fff inset, 0 1px #ddd;
    box-shadow: 0 1px #fff inset, 0 1px #ddd;
    background: #f5f5f5;
    background: -moz-linear-gradient(top, #f5f5f5 0%, #eeeeee 100%);
    background: -webkit-gradient(linear, left top, left bottom, color-stop(0%, #f5f5f5), color-stop(100%, #eeeeee));
    background: -webkit-linear-gradient(top, #f5f5f5 0%, #eeeeee 100%);
    background: -o-linear-gradient(top, #f5f5f5 0%, #eeeeee 100%);
    background: -ms-linear-gradient(top, #f5f5f5 0%, #eeeeee 100%);
    background: linear-gradient(top, #f5f5f5 0%, #eeeeee 100%);
    filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#f5f5f5', endColorstr='#eeeeee', GradientType=0);
}
.main-center{
 	margin-top: 30px;
 	margin: 0 auto;
 	max-width: 400px;
    padding: 10px 40px;
	background:#009edf;
	    color: #FFF;
    text-shadow: none;
	-webkit-box-shadow: 0px 3px 5px 0px rgba(0,0,0,0.31);
-moz-box-shadow: 0px 3px 5px 0px rgba(0,0,0,0.31);
box-shadow: 0px 3px 5px 0px rgba(0,0,0,0.31);

}
span.input-group-addon i {
    color: #009edf;
    font-size: 17px;
}

.login-button{
	margin-top: 5px;
}

.login-register{
	font-size: 11px;
	text-align: center;
}
.btn {
  background: #267cb5;
  background-image: -webkit-linear-gradient(top, #267cb5, #2980b9);
  background-image: -moz-linear-gradient(top, #267cb5, #2980b9);
  background-image: -ms-linear-gradient(top, #267cb5, #2980b9);
  background-image: -o-linear-gradient(top, #267cb5, #2980b9);
  background-image: linear-gradient(to bottom, #267cb5, #2980b9);
  -webkit-border-radius: 26;
  -moz-border-radius: 26;
  border-radius: 26px;
  font-family: Arial;
  color: #ffffff;
  font-size: 20px;
  padding: 10px 20px 10px 20px;
  text-decoration: none;
}
btn:hover {
  background: #3cb0fd;
  background-image: -webkit-linear-gradient(top, #3cb0fd, #3498db);
  background-image: -moz-linear-gradient(top, #3cb0fd, #3498db);
  background-image: -ms-linear-gradient(top, #3cb0fd, #3498db);
  background-image: -o-linear-gradient(top, #3cb0fd, #3498db);
  background-image: linear-gradient(to bottom, #3cb0fd, #3498db);
  text-decoration: none;
}

</style>
<script>  
function validateForm() {
  let x = document.forms["myForm"]["fname"].value;
  if (x == "") {
    alert("Name must be filled out");
    return false;
  }
}  
</script> 
<body>
<form name="myForm"  action="studentregister" method="post"  onclick="return validateForm()">
<center>

		<div class="container">
			<div class="row main">
				<div class="panel-heading">
	               <div class="panel-title text-center">

	               	</div>
	            </div> 
				<div class="main-login main-center">
					<form class="form-horizontal" method="post" action="#">
						
						<div class="form-group">
						<label for="Name" class="cols-sm-2 control-label">Name</label>
							
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
									
                                    <input type="text" class="form-control" name="Name" id="a1"  placeholder="Enter Your Name"/>
								</div>
							</div>
						</div>
				<div class="form-group">
							<label for="number" class="cols-sm-2 control-label">Number</label>
							<div class="cols-sm-10">
								<div class="input-group">
									
								<span class="input-group-addon"><i class="fa fa-phone" aria-hidden="true"></i></span>
								
                                    <input type="number" class="form-control" name="Contact" id="Contact"  placeholder="Enter Your Number"/>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="date" class="cols-sm-2 control-label">Date</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-calendar" aria-hidden="true"></i></span>
									
                                    <input type="date" class="form-control" name="DOB"/>
								</div>
							</div>
						</div>
						<div class="form-group">
						<label for="Email" class="cols-sm-2 control-label">Email</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
									
									<input type="text" class="form-control" name="Email" id="email"  placeholder="Your Email"/>
								</div>
							</div>
						</div>
<div class="form-group">
	<label for="Gender" class="cols-sm-2 control-label">Gender</label>
							<label for="Gender" class="cols-sm-2 control-label">Gender</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-genderless" aria-hidden="true"></i></span>
								
                                   <table>
                                   <tr>
                                    <td ><input type="radio" name="Gender" value="male">Male</td>
                                    </tr>
                                    <tr>
                                    <td>	<input type="radio" name="Gender" value="Female">Female</td>
                                    </tr>
                                    </table>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="Branch" class="cols-sm-2 control-label">Branch</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-university" aria-hidden="true"></i></span>
									<select class="form-control" name="Branch" id="Branch" >
                                    <option>-select-</option>
                                    <option>CSE</option>
                                    <option>CIVIL</option>
                                    <option>MECH</option>
                                    <option>EC</option>
                                  
                                    
                                    </select>
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="semister" class="cols-sm-2 control-label">semister</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-university" aria-hidden="true"></i></span>
									<select class="form-control" name="semister" id="semister" >
                                    <option>-select-</option>
                                    <option>1st</option>
                                    <option>2nd</option>
                                    <option>3rd</option>
                                    <option>4th</option>
                                    <option>5th</option>
                                    <option>6th</option>
                                    <option>7th</option>
                                    <option>8th</option>
                                    </select>
								</div>
							</div>
						</div>
	<div class="form-group">
							<label for="USN" class="cols-sm-2 control-label">USN</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-laptop" aria-hidden="true"></i></span>
                                    <input type="text" class="form-control" name="USN" id="USN"  placeholder="Enter Your USN"/>
								</div>
							</div>
						</div>
						
						<div class="form-group">
							<label for="Address" class="cols-sm-2 control-label">Address</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-home" aria-hidden="true"></i></span>
                                    <input type="text" class="form-control" name="Address" id="Address"  placeholder="Enter Your Address"/>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="Username" class="cols-sm-2 control-label">Username</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                    <input type="text" class="form-control" name="Username" id="Username"  placeholder="Enter Your UserName"/>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="Password" class="cols-sm-2 control-label">Password</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-eye-slash" aria-hidden="true"></i></span>
                                    <input type="Password" class="form-control" name="Password" id="Password"  placeholder="Enter Your Password"/>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="confirmpassword" class="cols-sm-2 control-label">confirm password</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-eye-slash" aria-hidden="true"></i></span>
                                    <input type="password" class="form-control" name="confirmpassword" id=" confirm password"  placeholder="Re Enter Your Password"/>
								</div>
							</div>
						</div>
						
<input class="btn" type="submit" value="Register" >
		<script type="text/javascript" src="assets/js/bootstrap.js"></script>
		
		</center>

		</form >
</body>
</html>