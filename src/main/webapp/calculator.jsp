<html>
<body>
<jsp:useBean id="cal" class="calculator.Calculator"></jsp:useBean>
<%     
out.print("Result:");  
double number1 = Double.parseDouble(request.getParameter("number1"));
double number2 = Double.parseDouble(request.getParameter("number2"));
String operand = request.getParameter("operand");
double result = cal.calculate(number1,number2,operand);
out.print(""+result);
%> 
</body>
</html>
