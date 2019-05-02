package calculator;

public class Calculator {
	public double calculate(double number1,double number2,String oparand){
		switch(oparand){
			case "add":return number1+number2;
			case "sub":return number1-number2;
			case "mul":return number1*number2;
			case "div":return number1/number2;
		}
		return 0.0;
	}
}
