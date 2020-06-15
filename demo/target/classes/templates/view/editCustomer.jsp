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
 <h1>Customer Form</h1>

<div>
<form:form   modelAttribute="customer" action="/demo/view/update" method="post">
 <table class="table table-stripped table-responsive table-hover">
 <tr>
 <td><form:label path="cid"  >Customer Id:</form:label></td>
 <td><form:input path="cid" value="${customer.cid}" readonly="true" /></td>
 <td><form:errors path="cid" cssClass="error" /></td>
 </tr>
 
 <tr>
 <td><form:label path="cfName">First Name:</form:label></td>
 <td><form:input path="cfName" value="${customer.cfName}"/></td>
 <td><form:errors path="cfName" cssClass="error" /></td>
 </tr>
 
 <tr>
 <td><form:label path="clName">Last Name:</form:label></td>
 <td><form:input path="clName" value="${customer.clName}"/></td>
 <td><form:errors path="clName" cssClass="error" /></td>
 </tr>
 <tr>
 <td colspan="2"><input type="submit" value="Upate Customer"/></td>
 </tr>
 </table>
 </form:form>
</div>


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
<td>${c.cid}</td>
<td>${c.cfName}</td>
<td>${c.clName}</td>
<td align="center">
<a href="/demo/view/editCustomer/${c.cid}">
<input type="button" value="EDIT" class="btn btn-info">
</a> 
</td>
<td>
<a href="/demo/view/deleteCustomer?id=${c.cid}">
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