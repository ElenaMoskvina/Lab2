import java.io.*;
import java.text.DecimalFormat;
import java.util.List;

public class PartOne {

	
	
	public float BCalc  (float a, float b, float e, List<Integer> mistakes, List<Integer> quantity) {
		float c = 0;
		float ya = 0;
		float yb = 0;
		float yc = 0;
		float partOfFirstPart =0;
		float firstPart =0;
		float secondPart =0;
		float thirdPart =0;
		
		System.out.println  ("a       |b       |c       |");
		
		while(Math.abs(b-a)>e) {
			c = (a+b)/2;
			for (int g = 0; g<mistakes.size(); g++ ) {
				partOfFirstPart = 1/(a-mistakes.get(g));
				firstPart = firstPart+partOfFirstPart;
				secondPart =secondPart+ mistakes.get(g);
				thirdPart = quantity.get(g)*mistakes.get(g)+ thirdPart;
			}
			
			ya =  firstPart-mistakes.size()*secondPart/((a+1)*secondPart-thirdPart);
			yb = firstPart-mistakes.size()*secondPart/((b+1)*secondPart-thirdPart);
			yc = firstPart-mistakes.size()*secondPart/((c+1)*secondPart-thirdPart);
			
			if (ya*yb<0) {
				a=a; b=c;
			}
			else a=c; b=b;
			
			String formattedA = new DecimalFormat("#0.0000").format(a);
			String formattedB = new DecimalFormat("#0.0000").format(a);
			String formattedC = new DecimalFormat("#0.0000").format(a);
		
		
			System.out.println (formattedA+" |"+formattedB+" |"+formattedC+" |");
			
			}
			
			System.out.println("Величина B равна: " + c);
		return c;
	}
	
	
	
	
	
}
