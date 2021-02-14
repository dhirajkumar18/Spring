<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

</head>
<body>
<h2>Hello World!</h2>
</body>
<form>
<table id="pendPre">

<tr>
<td>
Expiry Date
</td>
<td>
<input type="text" name="" value="09/2/2024" >
</td>
<td>
<select onchange="getBatchDetails(this.value,this)">

<option value="bt001">bt001</option>
<option value="bt002">bt002</option>
<option value="bt008">bt008</option>
</select>
</td>
</tr>

<tr>
<td>
Expiry Date
</td>
<td>
<input type="text" name="" value="09/2/2023">
</td>
<td>
<select onchange="getBatchDetails(this.value,this)">

<option value="bt001">bt001</option>
<option value="bt002">bt002</option>
<option value="bt008">bt008</option>
</select>
</td>
</tr>

<tr>
<td>
Expiry Date
</td>
<td>
<input type="text" name="" value="09/2/2022">
</td>
<td>
<select onchange="getBatchDetails(this.value,this)">

<option value="bt001">bt001</option>
<option value="bt002">bt002</option>
<option value="bt008">bt008</option>
</select>
</td>
</tr>

</table>
</form>

<input type="button" value="EmployeeDetails" onclick="getBatchDetails()">

<script type="text/javascript">
function getBatchDetails(value,item){
alert(value);
	$.ajax({
		url: "employee/getBatchDetails.htm?batchno="+value,
		success: function(data){
			alert(data);
			var arr=data.split("#");
			$(item).closest('tr').find('td:eq(1)').find(':input').val(arr[0]);
              console.log("your expiry is"+arr[0]);
              console.log("your stock available is"+arr[1]);
			}
		});
}

</script>

</html>
