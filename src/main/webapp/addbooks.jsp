<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Books Page</title>
<link rel="stylesheet" href="styles/user.css">
<link rel="stylesheet" href="styles/addbooks.css">
</head>
<body>
<header>
		<ul>
			<li class="left"><img src="images/Mars.png" height="95px"
				width="150px"></li>
			<li class="profile"><img alt="profile" src="images/profile.png" width="70px" height="70px"></li>
			<li class="admin">Administrator</li>
		</ul>
	</header>
	
	<nav>
		<div class="menu">
			<ul>
				<li><a href="home.jsp">Home</a></li>
				<li><a href="/Books">Books</a></li>
				<li><a href="orders.jsp">Orders</a></li>
				<li><a href="Users">Users</a></li>
				<li><a href="addbooks.jsp">Add Books</a></li>
			</ul>
		</div>
	</nav>
	<main>
	<p>${msg}</p>
	<div class="form-container">
		<form action="/addBooks" class="container" enctype="multipart/form-data" method="post">
			<label>Book ID</label>
			<input type="text" name="bkid" placeholder="Enter a id for the book" pattern="[A-Z]{2,4}[0-9]{3}" 
				title="The book id should contain 1 to 4 alphabets and 3 numbers" required>
				
			<label>Book Name</label>
			<input type="text" name="bkname" placeholder="Enter the name of the book" required pattern="[A-Za-z\s.]{8,50}"
				title="PLease enter a proper book name" >
				
			<label>Author Name</label>
			<input type="text" name="authorname" placeholder="Enter the author name of the book" pattern="[A-Z]{1}[A-Za-z\s\,]{4,18}"
				title="Please enter a valid author name" required>
				
			<label>Publisher</label>
			<input type="text" name="publisher" placeholder="Enter the publisher of the book" pattern="[A-Z]{1}[A-Za-z\s]{4,50}"
				title="Please enter a valid publisher name" required>
				
			<label>Category</label>
			<select name="category" id="category">
				<option disabled selected>Select a category</option>
				<option>Biography</option>
				<option>Education</option>
				<option>Novels</option>
				<option>Poetry</option>
				<option>History</option>
			</select>
			
			<label>Edition</label>
			<input type="text" name="edition" placeholder="Enter the edition of the book" pattern="[0-9]{1,2}"
				title="Please enter a valid edition number">
				
			<label>Language</label>
			<select name="lang" id="lang">
				<option disabled selected>Select a category</option>
				<option>English</option>
				<option>Tamil</option>
				<option>Hindi</option>
				<option>Malayalam</option>
				<option>Kanadam</option>
				<option>Telugu</option>
			</select>
			
			<label>Quantity</label>
			<input type="text" name="quantity" placeholder="Enter the available Quantity of the book" pattern="[0-9]*" required="required">
			
			<label>Price</label>
			<input type="text" name="price" placeholder="Enter the price of the book" pattern="[0-9]*" required>
			
			<label>MRP Rate</label>
			<input type="text" name="mrpRate" placeholder="Enter the MRP price of the book" pattern="[0-9]*" required>
			
			<label>Book Cover Page</label>
			<input type="file" name="file" accept="images/png, images/jpeg">
			<div></div>
			<input type="submit" name="submit" value="Add">
		</form>
	</div>
	</main>
</body>
</html>