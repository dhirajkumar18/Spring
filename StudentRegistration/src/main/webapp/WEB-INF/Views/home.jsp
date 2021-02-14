<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@page import="java.util.*" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

</head>
<body>
<h2>Welcome to Student Registration Form</h2>
<table id="pendingPre">
<tr>
<td>Expiry Date</td><td><input type ="text" value="10/12/2022"></td></td>
<td>city</td>
<td>
<select onchange="getMetro(this.value,this)">
<option value="patna">patna</option>
<option value="Delhi">Delhi</option>
<option value="mubai">Mumbai</option>
</select>
</td>
</tr>

<tr>
<td>Expiry Date</td><td><input type ="text" value="10/12/2021"></td></td>
<td>city</td>
<td>
<select id="m1" onchange="getMetro(this.value)" >
<option value="patna">patna</option>
<option value="Delhi">Delhi</option>
<option value="mubai">Mumbai</option>
</select>
</td>
</tr>

<tr>
<td>Expiry Date</td><td><input type ="text" value="10/12/2020"></td></td>
<td>city</td>
<td>
<select onchange="getMetro(this.value)">
<option value="patna">patna</option>
<option value="Delhi">Delhi</option>
<option value="mubai">Mumbai</option>
</select>
</td>
</tr>


</table>
 <script type="text/javascript">

function getMetro(value,item){
	/* window.location="/student/getMetro?city="+value;
	alert(value); */
	var Something = $(item).closest('tr').find('td:eq(0)').val('test');
	alert(Something);
	$.ajax({
	    url: "/student/getMetro?city="+value,
	    success: function(data) {
		    alert("success"+data.expiry +  data.closing_stock);	
	    }
	    
	});
}
 </script>

</form>
</body>
</html>