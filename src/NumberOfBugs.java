import java.io.*;
import java.text.DecimalFormat;
import java.util.List;

public class NumberOfBugs {

	
	
	public float BCalc  (float a, float b, float e, List<Integer> bugTime, List<Integer> bugNumber) {
		float c = 0;
		float ya = 0;
		float yb = 0;
		float yc = 0;
		float partOfFirstPartA =0;
		float firstPartA =0;
		
		float partOfFirstPartB =0;
		float firstPartB =0;
		
		float partOfFirstPartC =0;
		float firstPartC =0;
		
		float secondPart =0;
		float thirdPart =0;
		
		float x;
		
		System.out.println  ("a           |с           |b           |ya          |yс          |yb          |fpa         |fpb         |fpc         |sp         |tp         |");
				
		
		
		while(Math.abs(b-a)>e) {
				c = (a+b)/2;
				String formattedA = new DecimalFormat("#0.00000000").format(a);
				String formattedC = new DecimalFormat("#0.00000000").format(c);
				String formattedB = new DecimalFormat("#0.00000000").format(b);
			
				firstPartA = 0; //первая часть уравнения (1/(B+i-1) от переменной a
				firstPartB = 0; //первая часть уравнения (1/(B+i-1) от переменной b
				firstPartC = 0;	//первая часть уравнения (1/(B+i-1) от переменной c
				secondPart = 0;//вторая часть уравнения (сумма значений времени)
				thirdPart = 0; //третья часть уравнения(сумма произведений значений времени и номера ошибки)
				for (int i = 0; i<bugTime.size(); i++ ) {
					
					
					partOfFirstPartA = 1/(a-bugNumber.get(i)+1);
					firstPartA = firstPartA+partOfFirstPartA;
										
					partOfFirstPartB = 1/(b-bugNumber.get(i)+1);
					firstPartB = firstPartB+partOfFirstPartB;
										
					partOfFirstPartC = 1/(c-bugNumber.get(i)+1);
					firstPartC = firstPartC+partOfFirstPartC;
					
					secondPart =secondPart+ bugTime.get(i);
										
					thirdPart = thirdPart+bugNumber.get(i)*bugTime.get(i);
				}
				
				ya = firstPartA-((bugTime.size()*secondPart)/((a+1)*secondPart-thirdPart));
				yb = firstPartB-((bugTime.size()*secondPart)/((b+1)*secondPart-thirdPart));
				yc = firstPartC-((bugTime.size()*secondPart)/((c+1)*secondPart-thirdPart));
							
				
					
				
			String formattedYA = new DecimalFormat ("#0.00000000").format(ya);
			String formattedYC = new DecimalFormat ("#0.00000000").format(yc);
			String formattedYB = new DecimalFormat ("#0.00000000").format(yb);
			String formattedFirPartA = new DecimalFormat ("#0.00000000").format(firstPartA);
			String formattedFirPartB = new DecimalFormat ("#0.00000000").format(firstPartB);
			String formattedFirPartС = new DecimalFormat ("#0.00000000").format(firstPartC);
			String formattedSecPart = new DecimalFormat ("#0.00000000").format(secondPart);
			String formattedThPart = new DecimalFormat ("#0.00000000").format(thirdPart);
			
			System.out.println (formattedA+" |"+formattedC+" |"+formattedB+" |"+formattedYA+" |"+formattedYC+" |"+formattedYB+" |"+formattedFirPartA+"|"+formattedFirPartС+"|"+formattedFirPartB+" |"+formattedSecPart+" |"+formattedThPart+" |");
			
			if (ya*yc<0) {
				a=a; b=c;
			}
			else if (yb*yc<0) {
				a=c; b=b;
				
			}
			else { 
				System.out.println ("На заданном промежутке ошибка: нет корня / значения точек диапазона не в области определения функции / на промежутке несколько корней");	
				c = (Float) null;
				break;
						}
			
		}
			
			System.out.println("Величина B равна: " + c);
		
			return c;
	}
	
}
