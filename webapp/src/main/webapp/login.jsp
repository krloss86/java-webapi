<%-- bootstrap--%>
<html>
	<header>
	<!-- CSS only -->
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
		<!-- JS, Popper.js, and jQuery -->
		<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
	</header>
	
	<body>
	<div class="container">
			<h1>Java Web Api - Login</h1>
			<form action="<%=request.getContextPath()%>/login" method="POST">
			  <div class="form-group">
			    <label for="username">Usuario</label>
			    <input name="username" type="text" class="form-control" id="username">
			  </div>
			  <div class="form-group">
			    <label for="password">Password</label>
			    <input name="password" type="password" class="form-control" id="password">
			  </div>
			  <button type="submit" class="btn btn-primary">Login</button>
			  <a href="<%=request.getContextPath()%>"
						class="btn btn-primary btn-md">
						<span class="glyphicon glyphicon-home"></span> Take Me Home 
					</a>
			</form>
		</div>
	</body>
</html>