package calculator;

public class Calculator {
	public String calculate(double number1,double number2,String oparand){
		String result="";
		switch(oparand){
			case "add":result = ""+ (number1+number2); break;
			case "sub":result = ""+ (number1-number2); break;
			case "mul":result = ""+ (number1*number2); break;
			case "div":result = ""+ (number1/number2); break;
		}
		int indexOfDot = result.indexOf(".");
		int lenghtOfResult = result.length()-1;
		if(lenghtOfResult - indexOfDot > 1)
		    return result;
		else if(result.charAt(indexOfDot+1) != '0')
		    return result;
		else
		    return result.substring(0,indexOfDot);
	}
}
