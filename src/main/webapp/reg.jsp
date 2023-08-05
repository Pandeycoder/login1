<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor=green text=yellow>
        <center>
		<h2>Registration Form</h2>
		
		<form id=frm name=frm action=reg method=post>

			<label class=label1>Full Name</label><br> 
			<input type=text	class=text1 name=fname placeholder=name /><br>
				
			<br> <label class="label1">Email Address</label> 
			<input type=email class=text1 name=eid placeholder=email /><br><br>
			
			<label class="label1">Password</label><br>
			<input	type=password class=text1 name=pword placeholder=password\><br>
				
		
				
				<label class=label1>Mobile</label><br> 
				<input type=text name=mob placeholder="Enter your Mobile number" class="text1" /><br> <br>
				
			<label class="label1">Linkedin Profile Link</label><br>
			 <input	type="text" name=linkdin placeholder="Enter your Linkedin Profile Link" class="text1"><br><br>
			 
			<label class="label1">Github Link</label><br>
			 <input type="text"	name=github placeholder="Enter your Github Link" class="text1"><br><br>
			 
			<label class="label1">Highest Qualification</label><br> 
			<input type="text" name=quali placeholder="Enter your Highest Qualification" class="text1"><br><br>
				
			<label class="label1">Stream Name</label><br>
			<input type="text"	name=sub placeholder="Enter your Stream Name" class="text1"><br><br>
			
			
			<label class="label1">College Name</label><br>
			<input	type="text" name=call placeholder="Enter your College Name" class="text1"> <br><br>
			
			<label class="label1">Passing Year</label><br> 
			<input type="text" name=year placeholder="Enter your Passing Year"	class="text1"> <br><br>
			
			 <label class="label1">Gender</label><br>
                           Male<input type="radio" name="gender" value="Male">
                           Female<input type="radio" name="gender" value="Female" >
                           Other<input type="radio" name="gender" value="Other" ><br>
                           
               
                           <br><label class="label1">Country Code</label class="form-control"><br>
                            <select class="text1">
                                <option value="india" name=ccode>+91</option class="form-group" name=ccode>
                                <option value="usa" name=ccode>+1</option class="form-group" name=ccode>
                                <option value="pakistan" name=ccode>+92</option>
                                <option value="afghanistan" name=ccode>+93</option>
                                <option value="srilanka" name=ccode>+94</option>
                            </select><br><br>
                            
                             <br><br><input type="checkbox" name="accept" class="check">
                           <label class="label1">Accept</label>
                           <a href="term_condition.jsp" class="term">Terms & Conditions</a>
			
			<br> <input type="submit" name=sb class="sb" value="Apply" /><br>
		</form>
	</center>


</body>
</html>