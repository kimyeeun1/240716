package homework240729;

import java.util.Scanner;

public class CalculatorMain {
	
	public static double calculator (String operator, double numOne, double numTwo) {
		
		if(operator.equals("+")) {
			return numOne + numTwo;
		}
		else if (operator.equals("-")) {
			return  numOne - numTwo;
		}
		else if (operator.equals("*")) {
			return numOne * numTwo;
		}
		else if (operator.equals("/")) {
			return numOne / numTwo;
		}
		return 0;
	}

	
	public static boolean operatorCheck (String operator){
		
		if(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
			return true;
		}
		return false;
	}
		
		
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("연산자를 입력해주세요");
			String operator = null;
			operator = scanner.nextLine();
			
			if(!operatorCheck(operator)) {
				throw new operatorException("+,-,*,/");
			}
			if(operator == "exit") {
				break;
			}
			
			System.out.println("첫번째 숫자를 입력해주세요");
			double numOne = scanner.nextDouble();
			
			System.out.println("두번째 숫자를 입력해주세요");
			double numTwo = scanner.nextDouble();
			
			System.out.println(calculator(operator, numOne, numTwo)); 
		}
	}
}
