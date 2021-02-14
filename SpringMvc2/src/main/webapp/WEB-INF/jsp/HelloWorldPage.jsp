<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
    <h1>Spring MVC Hello World Example</h1>

    <h2>${msg}</h2>
</body>
<a href="/spring2-mvc-xml-hello-world/test?method=handleRequestInternal" >Handler</a>
<form>
<table>
<tr>
<td>Expiry Date</td>
<td><input type="text" name="" value="13/02/2021"></td>
<td>city</td>
<td>
<select onchange="getDetails(this.value)" >

<option value ="delhi">delhi</option>
<option value="patna">patna</option>
<option value="gaya"></option>
</select>

</td>
</tr>

<tr>
<td>Expiry Date</td>
<td><input type="" name="" value=""></td>
<td>city</td>
<td>
<select >

<option value ="delhi">delhi</option>
<option value="patna">patna</option>
<option value="gaya"></option>
</select>

</td>
</tr>

<tr>
<td>Expiry Date</td>
<td><input type="" name="" value=""></td>
<td>city</td>
<td>
<select >

<option value ="delhi">delhi</option>
<option value="patna">patna</option>
<option value="gaya"></option>
</select>

</td>
</tr>


</table>
</form>
<script type="text/javascript">

function getDetails(value){
$.ajax({
	url:"/spring2-mvc-xml-hello-world/test?method=handleRequestInternal",
	success:function(data){
		alert("success "+data.name);
		}	
});
	
}

</script>

</html>