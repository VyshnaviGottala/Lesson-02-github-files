<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/display" method="get"></form>
	<table>
		<tr>
			<!-- <th>DType</th> -->
			<th>ProductId</th>
			<th>Price</th>
			<th>ProductName</th>
		    <th>ApparalBrand</th>
			<th>ApparalDesign</th>
			<th>ApparalType</th> 
			<th>BookAuthor</th>
			<th>BookGenre</th>
			<th>BookPublications</th>
		</tr>
		<tbody>
			<c:forEach items="${getAllProducts}" var="product">
				<tr bgcolor="white">
					<%-- <td>${product.dtype}</td> --%>
					<td>${product.productId}</td>
					<td>${product.price}</td>
					<td>${product.productName}</td>
					<td>${product.apparalBrand}</td>
					<td>${product.apparalDesign}</td>
					<td>${product.apparalType}</td> 
					<td>${product.bookAuthor}</td>
					<td>${product.bookGenre}</td>
					<td>${product.bookPublications}</td>
					<td><form action="/Products/add/${product.productId}"
							method="POST">
							<button type="submit" name="update">ADD CART</button>
						</form></td>
				</tr>
			</c:forEach>
		</tbody>

		<tr>
		</tr>
	</table>
	<%--     <td><a href="<c:url value='/add/${product[status.index].productId}' />" <button type="submit" name="update">ADD CART</button>>Edit</a></td> --%>
</body>
</html>