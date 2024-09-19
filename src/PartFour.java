import java.util.List;

public class PartFour {
	
	public float TTCalc (float c, float k1, List<Integer> mistakes,  List<Integer> quantity) {
	
	float t1 = 0;
	float partFirstG = 0;
		
	int newc = Math.round(c);
		
	for (int i = 0 ; i<(newc-mistakes.size()); i++) {
		partFirstG = partFirstG+1/quantity.get(i).floatValue();
			
	}
	
	t1=(1/k1)*partFirstG;
	System.out.println ("Время до начала тестирования " + t1);
		
	return t1;
	}
}
