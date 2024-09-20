import java.util.List;

public class ScaleFactor {

	
	public float KCalc (float c, List<Integer> mistakes, List<Integer> bugNumber ) {
	float k1 = 0;
	float k2 = 0;
	float partFirstB = 0;
	float partOfPartFirstB = 0;
	float partSecondB = 0;
	float partThirdB = 0;
	
	for (int i = 0; i<mistakes.size(); i++) {
		
		partOfPartFirstB=(c-i)*mistakes.get(i);
		partFirstB = partFirstB+partOfPartFirstB;
		
		partSecondB = partSecondB+mistakes.get(i);
		
		partThirdB = partThirdB+bugNumber.get(i)*mistakes.get(i);
		
		//System.out.println(partFirstB +" "+partSecondB+" "+partThirdB);
	
	}
	
		
	k1=mistakes.size()/partFirstB;
	System.out.println ("Коэффициент пропорциональности1 " +k1);
			
	k2=mistakes.size()/((c+1)*partSecondB-partThirdB);
	System.out.println ("Коэффициент пропорциональности2 " +k2);
	
	return k1;

	}
}