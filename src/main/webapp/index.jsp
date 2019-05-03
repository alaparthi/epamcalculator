<!DOCTYPE html>
<html>
	<head>
		<style type="text/css">
			div{
				text-align:center;
				margin-top: 100px;
				padding: 5px 5px 5px 5px;
			}
			input,select{
				margin-top: 10px;
			}
		</style>
	</head>
	
	<body>
		<div>
		<h1>Calculator</h1>
		<form action="calculator.jsp" method="post">
			<input type="number" name="number1" value=0><br>
  			<input type="number" name="number2" value=0><br>
  				<select name="operand">
					<option value="add">add</option>
				  	<option value="sub">sub</option>
				  	<option value="mul">mul</option>
				  	<option value="div">div</option>
				</select><br>
  			<input type="submit" value="calculate">
  			
		</form>
		</div>
	</body>
</html>