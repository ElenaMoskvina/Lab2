import java.util.List;

public class PartThree {
	public float TCalc (float c, float k1, List<Integer> mistakes) {
	float t = 0;
	t=1/(k1*(c-mistakes.size()+1));
	System.out.println ("Среднее время до появления ошибки " + t);
	return t;
	}
}
