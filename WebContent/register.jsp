<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.util.*" %>
        <%@ page import ="com.bean.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Toddler</title>
</head>
<body>
<%  ArrayList <Babysitter> Bslist =(ArrayList <Babysitter>) request.getAttribute("Bslist1"); %>
<div>
<h1>Daycare Management System</h1>
</div>
<div>
<form action="Controller" method=post>
<table>

<td>ToddlerId</td>
<td><input type="text" name="tdid" required></td>

<tr>
<td>ToddlerName</td>
<td><input type="text"  name="tdname" required></td>

</tr>

<tr>
<td>ToddlerAge</td>
<td><input type="text" name="tdage" required></td>

</tr>
<tr>
<td>Babysitter</td>
<td>
<select name="bsid">
<% for (Babysitter b : Bslist) {%>
<option value=<%= b.getBsId() %>><%=b.getBsName() %></option>
<%} %>
</select>
</td>

</tr>

<tr>
<input type="hidden" name=form1 value="registertod">
 <td><input type="submit" value="Submit"></td>

</tr>
</table>
</form>
</div>
<div>
<h5>Copyright @ LGID</h5>
</div>
</body>
</html>