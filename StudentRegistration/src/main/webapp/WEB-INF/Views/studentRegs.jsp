<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Entry</title>
</head>
<body bgcolor="orange">
<h2>Please Enter Student Details</h2>
    <p>${msg}</p>
	<form action="registerStudent" method="post">
		<table>
        <tr>
        <td>Student Name</td>
        <td><input type="text" name="name" id="name"></td>
        </tr>
        <tr>
        <td>Course</td>
        <td><input type="text" name="course" id="course"></td>
        </tr>
        <tr>
        <td>Gender</td>
        <td>
        <select name="gender">
        <option value="">Select </option>
        <option value="1">Male</option>
        <option value="2">Female </option>
        </select>        
        </td>
        </tr>
        <tr>
        <td>Address</td>
        <td>
        <textarea rows="4" cols="50" name="address" id="address"></textarea>
        </td>
        </tr>
        <tr>
        <td>State</td>
        <td><select name="state">
        <option value="">Select</option>
        <c:forEach items="${stateList}" var="state">
        <option value="${state.id}">${state.name}</option>
        </c:forEach>
        </select></td>
        </tr>
        <tr>
        <td><input type="submit" value="Submit"></td>
        <td><input type="reset" value="Reset"></td>
        </tr>
        
		</table>

	</form>
	<c:if test="${not empty studentData}">
	<form>
	<table border="1">
	<tr>
	<th>Sr. No.</th><th>Student Name<th>Course</th><th>Gender</th><th>Address</th><th>State</th>
	<c:forEach items="${studentData}" var="studentData" varStatus="counter">
	<tr>
	<td>${counter.count}</td>
	<td>${studentData.studentName}</td>
	<td>${studentData.course}</td>
	<c:if test="${studentData.sex == '1'}"><td>Male</td></c:if>
	<c:if test="${studentData.sex == '2'}"><td>Female</td></c:if>
	<td>${studentData.address}</td>
	<%-- <td>${studentData.state.name}</td> --%>
	</tr>
	
	</c:forEach>
	</tr>
	</table>
	
	</form>
	</c:if>

</body>
</html>