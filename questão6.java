package lista2;
import java.util.Scanner;
public class quest�o6 {
public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
String produto;
double q, p, tc, tp, desconto;  
		
		System.out.println("Qual � o produto?");
		produto = scan.next();
		
		System.out.println("Quantas unidades do produto foram compradas?");
		q = scan.nextFloat();
		
		System.out.println("Qual � o pre�o unit�rio do produto?");
		p = scan.nextFloat(); 
		
		tc = q*p;
		System.out.println("O total da compra � R$" +tc); 
		
		if (q<=5) {
		tp = tc - (tc*0.02);
		System.out.println("Voc� ter� um desconto de 2% ");
		System.out.println("valor final a ser pago �: R$" +tp );
		} else 
		if (q>5 | q<=10) {
		tp = tc - (tc*0.03);
		System.out.println("Voc� ter� um desconto de 3% ");
		System.out.println("valor final a ser pago �: R$" +tp );
		} else if 
	    (q>10) {
		tp = tc - (tc*0.05);
		System.out.println("Voc� ter� um desconto de 5%");
		System.out.println("valor final a ser pago �: R$" +tp );
		}
		}
		
	}


