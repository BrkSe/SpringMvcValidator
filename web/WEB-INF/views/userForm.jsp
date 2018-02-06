<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<title>Burak KUTBAY</title>
</head>
<body>
<center>
  <form:form action="saveUser" method="post" modelAttribute="user">
    <table>
      <tr>
        <th>Name</th>
        <td>
          <form:input path="name" /> 
          <form:errors path="name"/>
         </td>
      </tr> <tr>
        <th>Surname</th>
        <td>
          <form:input path="surname" />
          <form:errors path="surname"/>
         </td>
      </tr>
      <tr>
        <th>Email</th>
        <td>
            <form:input path="email" /> 
            <form:errors path="email"/>
         </td>
      </tr>
    </table>
    <button type="submit">Submit</button>
  </form:form>
</center>
</body>
</html>