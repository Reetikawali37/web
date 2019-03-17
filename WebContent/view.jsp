<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.util.*" %>
        <%@ page import ="com.bean.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View all Toddlers</title>
</head>
<%  ArrayList <view> vlist =(ArrayList <view>) request.getAttribute("viewlist1"); %>
<body>
<table>
<tr>
<th>Toodler Id</th>
<th>Toodler Name</th>
<th>Toodler Age</th>
<th>Babysitter Id</th>
<th>Babysitter Name</th>
<th>Babysitter Age</th>
<th>Babysitter Status</th>
<th>Babysitter Experience</th>
<th>Babysitter Type</th>
</tr>
<%for(view v:vlist) {%>
<tr>
<td><%= v.getToddlerId() %></td>
<td><%= v.getToddlerName()%></td>
<td><%= v.getToddlerAge()%></td>
<td><%= v.getBsid()%></td>
<td><%= v.getBsName()%></td>
<td><%= v.getBsAge()%></td>
<td><%= v.getBsStatus()%></td>
<td><%= v.getBsExperience()%></td>
<td><%= v.getBsType()%></td>
<% if(v.getBsType().equalsIgnoreCase("Full-Time")){ %>
<td><a href="Controller?action=update&todid=<%=v.getToddlerId()%>">Update</a></td>
<%} %>
<td>
<a href="Controller?action=delete&todid=<%=v.getToddlerId()%>">Delete</a>
</td>
</tr>
<%} %>
</table>
</body>
</html>