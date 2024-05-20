<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Books</title>
</head>
<body>
	<h4>Book Details</h4>


<form action="book">
    Book Id : 
    <input type="text" name="id"> <br>
    <button type="submit">Search</button> <!-- Corrected button label -->
</form>

	<hr>
	Book Id : ${book.bookId}
	<br> 
	Book Name : ${book.bookName}
	<br> 
	Book Price : ${book.bookPrice}
	<br>
</body>
</html>