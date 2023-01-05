package lista2;
import java.util.Scanner;
public class questão2 {
public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);

int hv, hn, mv, mn, s, p; 
	
	System.out.println("Qual é a idade do homem mais velho?");
	 hv = scan.nextInt();
	System.out.println("Qual é a idade do homem mais novo?");
	 hn = scan.nextInt();
	System.out.println("Qual é a idade da mulher mais velha?");
	 mv = scan.nextInt();
	System.out.println("Qual é a idade da mulher mais nova?");
	 mn = scan.nextInt();
	
	 s = hv + mn;
	 p = hn*mv; 
	
	System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: "+s);
	System.out.println("O produto da idade do homem mais novo com a mulher mais velha é: "+p);
	
	
	}

}
