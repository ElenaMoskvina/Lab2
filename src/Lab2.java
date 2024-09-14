import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab2 {

public static void main (String[] args) throws IOException  {
	
	//считать из файла параметры
	System.out.println ("Данные файла lab2.txt");
	System.out.println ("q  |"+ "m  |");
	Path filePath = Paths.get("lab2.txt");
	Scanner scanner = new Scanner(filePath);
	List<Integer> mistakes = new ArrayList<>();
	List<Integer> quantity = new ArrayList<>();
	int q = 1;
	int i = -1;
	while (scanner.hasNext()) {
		if(scanner.hasNext()) {
			mistakes.add(scanner.nextInt());
			quantity.add(q++);
			i++;
			
			String formattedQ = new DecimalFormat("00").format(quantity.get(i));
			String formattedM = new DecimalFormat("00").format(mistakes.get(i));
			
			System.out.println (formattedQ+" |"+formattedM+" |");
			
		}
		else {
			scanner.next();
		}
	}
	

	//считать из консоли параметры
	Scanner in = new Scanner(System.in);
	System.out.println ("Input a");
	float a = in.nextFloat();
	System.out.println ("Input b");	
	float b = in.nextFloat();
	System.out.println ("Input e");
	float e = in.nextFloat();
	
	//Пункт 1
	PartOne partOne = new PartOne();
	float c = partOne.BCalc(a, b, e, mistakes, quantity);
	
	
	//Пункт 2
	
	PartTwo partTwo = new PartTwo();
	float k1= partTwo.BCalc(c, mistakes, quantity );
		
		
	//Пункт 3
	
	PartThree partThree = new PartThree();
	float t = partThree.TCalc(c, k1, mistakes);
	
	
	
	PartFour partFour  = new PartFour();
	float tt =  partFour.TTCalc (c, k1, mistakes, quantity);
	}
}

