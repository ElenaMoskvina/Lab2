import java.util.List;

public class PartFour {
	
	public float TTCalc (float c, float k1, List<Integer> mistakes,  List<Integer> quantity) {
	float tt = 0;
	float partFirstG = 0;
	for (int j = 0 ; j<(c-mistakes.size()); j++) {
		partFirstG = partFirstG+1/quantity.get(j);
		
	}
	tt=(1/k1)*partFirstG;
	System.out.println ("Время до начала тестирования " + tt);
	return tt;
}
}
