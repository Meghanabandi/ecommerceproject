<%@include file="Header.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h3 align="center">Product Page</h3>

<form action="<c:url value="/addCategory"/>" method="post">

<table align="center">

<tr>
		<td>Product id </td>
		<td><input type="text" id="Product id " name="Product id "/></td>
	</tr>
	<tr>
		<td>Product Name </td>
		<td><input type="text" id="Product Name " name="Product Name "/></td>
	</tr>
	<tr>
		<td>Product Desc </td>
		<td><input type="text" id="Product Desc " name="Product Desc "/></td>
	</tr>
	
	
	<tr>
		<td>Price </td>
		<td><input type="text" id="Price " name="Price "/></td>
	</tr>
		<td>stock </td>
		<td><input type="text" id="stock " name="stock "/></td>
	</tr>
	<tr>
		<td colspan="2"><input type="submit" value="Add Product"/></td>
	</tr>
</table>
</form>

<table align="center" border="1">
	<tr>
		<td>Product ID</td>
		<td>Product Name</td>
		<td>Product Desc</td>
		<td>Price</td>
		<td>Stock</td>
		<td>Operations</td>
	</tr>
	<c:forEach items="${listproducts}" var="category">
	<tr>
		<td>${product.productId}</td>
		<td>$product.productName}</td>
		<td>${product.productDesc}</td>
		
		<td>${product.price}</td>
		<td>${product.stock}</td>
		<td>
			<a href="<c:url value="/editProduct/${product.productId}"/>">Edit</a>
			<a href="<c:url value="/deleteProduct/${product.productId}"/>">Delete</a>
		</td>
	</tr>
	</c:forEach>
</table>

</body>
</html>