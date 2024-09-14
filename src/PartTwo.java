import java.util.List;

public class PartTwo {

	
	public float BCalc (float c, List<Integer> mistakes, List<Integer> quantity ) {
	float k1 = 0;
	float k2 = 0;
	float partFirstB = 0;
	float partOfPartFirstB = 0;
	float partSecondB = 0;
	float partThirdB = 0;
	
	for (int h = 0; h<mistakes.size(); h++) {
		partOfPartFirstB=(c-h)*mistakes.get(h);
		partFirstB = partFirstB+partOfPartFirstB;
		partSecondB = partSecondB+mistakes.get(h);
		partThirdB = partThirdB+quantity.get(h)*mistakes.get(h);
		//System.out.println(partFirstB +" "+partSecondB+" "+partThirdB);
	
	}
	
		
	k1=mistakes.size()/partFirstB;
	System.out.println ("Коэффициент пропорциональности1 " +k1);
			
	k2=mistakes.size()/((c+1)*partSecondB-partThirdB);
	System.out.println ("Коэффициент пропорциональности2 " +k2);
	
	return k1;

	}
}