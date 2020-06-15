<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
 </head>
 <body>
 <div class="container">
 
 
 <h1>List of Customers</h1>
<h3><a href="addCustomer">Add Customer</a></h3>


<div>
<c:if test="${!empty customers}">
 <h2>List of Customers</h2>
 <table class="table table-stripped table-responsive table-hover">
 <tr>
 <th>Customer Id</th>
 <th>First Name</th>
 <th>Last Name</th>
 <th>Edit</th>
 <th>Delete</th>
</tr>
<c:forEach items="${customers}" var="c">
<tr>
<td>${c.customerId}</td>
<td>${c.firstName}</td>
<td>${c.lastName}</td>
<td align="center">
<a href="/demo/view/edit/${c.cid}">
<input type="button" value="EDIT" class="btn btn-info">
</a> 
</td>
<td>
<a href="/demo/view/delete?id=${c.cid}">
<input type="button" value="DELETE" class="btn btn-primary">
</a></td>
</tr>
</c:forEach>
</table>
 </c:if>
 </div>
 </div>
 
 </body>
 </html>