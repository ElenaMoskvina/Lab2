import java.util.List;

public class AverageBugTime {
	public float TCalc (float c, float k1, List<Integer> mistakes) {
	float t1 = 0;
	float t2 = 0;
	t1=1/(k1*(c-mistakes.size()));
	System.out.println ("Среднее время до появления ошибки " + t1);
	
	return t1;
	}
}
