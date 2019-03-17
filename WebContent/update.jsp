<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.util.*" %>
        <%@ page import ="com.bean.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update</title>
</head>
<% Toddler t1= (Toddler)request.getAttribute("tod1"); %>
<body>
<form method="post"  action="Controller">
<table>
<tr>
<td>Toodler Id</td>
<td><input type="text" name="tdid" value="<%=t1.getToddlerId() %>" readonly></td>
</tr>
<tr>
<td>Toodler Name</td>
<td><input type="text" name="tdname" value="<%=t1.getToddlerName() %>"></td>
</tr>
<tr>
<td>Toodler Age</td>
<td><input type="text" name="tdage" value="<%=t1.getToddlerAge() %>"></td>
<input type="hidden" name="bsid" value="<%=t1.getBsid() %>">
</tr>
<tr>
<input type="hidden" name="form1" value="updatetod">
<td><input type="submit" value="Submit"></td>
</tr>

</table>
</form>
</body>
</html>