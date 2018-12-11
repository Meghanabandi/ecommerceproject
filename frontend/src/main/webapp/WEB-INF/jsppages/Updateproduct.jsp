<%@include file="Header.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h3 align="center">Update Product Page</h3>

<form action="<c:url value="/updateProduct"/>" method="post">

<table align="center">
	<tr>
		<td>Product ID </td>
		<td><input type="text" id="productId" name="productId" value="${product.productId}" readonly/></td>
	</tr>
	<tr>
		<td>Product Name </td>
		<td><input type="text" id="productName" name="productName" value="${product.productName}"/></td>
	</tr>
	<tr>
		<td>Product Desc </td>
		<td><input type="text" id="productDesc" name="productDesc" value="${product.productDesc}"/></td>
	</tr>
	<tr>
		<td>Product price </td>
		<td><input type="text" id="productprice" name="productprice" value="${product.productprice}"/></td>
	</tr>
	<tr>
		<td>Product stock </td>
		<td><input type="text" id="producstock" name="productstock" value="${product.productstock}"/></td>
	</tr>
	<tr>
		<center>
		<td colspan="2"><input type="submit" value="Update Product"/></td>
		</center>
	</tr>
</table>
</form>
